import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product/product.service';
import {Product} from '../product/product';
import {ViewChild} from '@angular/core';
import {MatPaginator, PageEvent} from '@angular/material/paginator';
@Component({
  selector: 'product-data-view',
  templateUrl: './product-data-view.component.html',
  styleUrls: ['./product-data-view.component.css']
})
export class ProductDataViewComponent implements OnInit {

  products:Product[];
  page:Product[];
  pagesize:number;
  index:number;
  length:number;
  @ViewChild(MatPaginator) paginator: MatPaginator;
  pageEvent:PageEvent;

  /*
    What i was working on when i left off
    Getting paginator to work with grid list
    Paginator isnt allowing page changes 
    images arent loading
    
  */

  constructor(private productService: ProductService) { 
    
  }
  
  ngOnInit(): void {
    this.index=0;
    this.pagesize = 5;
  
    this.productService.getProducts().subscribe(
      (data)=>{
        this.products=data;
        this.page = this.products.slice(0,this.pagesize);
        this.length = this.products.length;
        console.log(this.products[0].name)
      });
  }

  onPageChange(event?: PageEvent){
    console.log("onPageCHange entered");
        let start = event.pageIndex * event.pageSize;
        let end = start + event.pageSize;

        if(end > this.products.length){
          end = this.products.length;
        }
        this.page = this.products.slice(start,end);
        return this.products.slice(start,end);
  }

}

