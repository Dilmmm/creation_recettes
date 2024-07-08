/*import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Front_crea-recettes';
}*/

import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProduitModel } from './models/produit.model';
import { ApiService } from './services/api.service';
import {CommonModule, NgFor, NgIf} from "@angular/common";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, NgIf, NgFor],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ApiService]
})
export class AppComponent implements OnInit {
  title = 'Création de recettes';
  loading = true;
  produits: ProduitModel[] = [];

  constructor(private apiService: ApiService) {}

  ngOnInit() {
    this.loading = true;
    this.apiService.getProduits().subscribe((data: ProduitModel[]) => {
      this.produits = data;
      this.loading = false;
    });
  }
}
