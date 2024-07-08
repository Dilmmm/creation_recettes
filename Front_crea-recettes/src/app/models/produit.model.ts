
import { CategorieModel } from './categorie.model';
import { RecetteModel } from './recette.model';

export class ProduitModel {
  id: number;
  nom: string;
  description: string;
  image: string;
  categorie: CategorieModel;
  recettes: RecetteModel[];

  constructor(
    id: number,
    nom: string,
    description: string,
    image: string,
    categorie: CategorieModel,
    recettes: RecetteModel[]
  ) {
    this.id = id;
    this.nom = nom;
    this.description = description;
    this.image = image;
    this.categorie = categorie;
    this.recettes = recettes;
  }
}
