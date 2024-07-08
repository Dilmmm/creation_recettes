// recette.model.ts
import {ProduitModel} from "./produit.model";

export class RecetteModel {
  id: number;
  nom: string;
  description: string;
  produits: ProduitModel[];

  constructor(id: number, nom: string, description: string, produits: ProduitModel[]) {
    this.id = id;
    this.nom = nom;
    this.description = description;
    this.produits = produits;
  }
}
