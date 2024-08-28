import { Component } from '@angular/core';
import { ProduitService } from './services/produit.service';
import {ListeProduitComponent} from "./liste-produit/liste-produit.component";


@Component({
  selector: 'app-root',
  standalone: true,
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  imports: [
    ListeProduitComponent
  ],
  providers: [ProduitService]
})
export class AppComponent {
  title = 'Création de recettes';

}
