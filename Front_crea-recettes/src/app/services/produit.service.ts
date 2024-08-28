// src/app/produit.service.ts

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {ProduitModel} from "../models/produit.model";

const baseUrl = 'http://localhost:8080/api/produits';
@Injectable({
  providedIn: 'root'
})
export class ProduitService {

  constructor(private http: HttpClient) {}
  getProduits(): Observable<ProduitModel[]> {
    return this.http.get<ProduitModel[]>(baseUrl);
  }

  getProduitById(id: number): Observable<ProduitModel> {
    return this.http.get<ProduitModel>(`${baseUrl}/${id}`);
  }

  createProduit(produit: ProduitModel): Observable<ProduitModel> {
    return this.http.post<ProduitModel>(baseUrl, produit);
  }

  updateProduit(id: number, produit: ProduitModel): Observable<ProduitModel> {
    return this.http.put<ProduitModel>(`${baseUrl}/${id}`, produit);
  }

  deleteProduit(id: number): Observable<void> {
    return this.http.delete<void>(`${baseUrl}/${id}`);
  }
}
