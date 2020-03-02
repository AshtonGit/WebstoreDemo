import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Product} from "./product"
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private databaseUrl = "/api/v1/inventory"

  constructor(private http: HttpClient) { }

  getProducts(){    
    return this.http.get<Product[]>(this.databaseUrl);
  }

  getTestProducts(){
    return [
        {
          "name": "Banana",
          "img": "/api/v1/image/1",
          "id":0,
          "price":2
        },
        {
          "name": "Orange",
          "img": "/api/v1/image/3",
          "id":0,
          "price":2
        }
    ]
  }
}
