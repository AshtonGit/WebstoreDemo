import { Component, OnInit } from '@angular/core';
import {ProductService} from './product.service';
import {Product} from './product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  public products: Product[];

  constructor(productService: ProductService) {
    productService.getProducts().subscribe((data)=>{
      this.products = data;
    });
   }

  ngOnInit(): void {
  }

}
