package fr.mesrecettes.creation_recettes.controller;

import fr.mesrecettes.creation_recettes.model.Produit;
import fr.mesrecettes.creation_recettes.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProduitController {

    @Autowired
    ProduitService produitService;
    @GetMapping("/produits")
    public ResponseEntity<List<Produit>> listeProduits() {
        List<Produit> produits = produitService.getAllProduit();
        return ResponseEntity.ok(produits);
    }
}
