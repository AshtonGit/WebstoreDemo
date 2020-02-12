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
}
