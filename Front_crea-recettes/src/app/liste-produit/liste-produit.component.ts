import { Component } from '@angular/core';
import {ProduitModel} from "../models/produit.model";
import {ProduitService} from "../services/produit.service";
import {RouterOutlet} from "@angular/router";
import {CommonModule, NgFor, NgIf} from "@angular/common";

@Component({
  selector: 'app-liste-produit',
  standalone: true,
  imports: [RouterOutlet, CommonModule, NgIf, NgFor],
  templateUrl: './liste-produit.component.html',
  styleUrl: './liste-produit.component.css'
})
export class ListeProduitComponent {
  isPresent = false;
  produits: ProduitModel[] = [];

  constructor(private produitService: ProduitService) {}

  ngOnInit() {
    this.produitService.getProduits().subscribe((data: ProduitModel[]) => {
      this.produits = data;
      this.isPresent = true;
    });
  }

}
