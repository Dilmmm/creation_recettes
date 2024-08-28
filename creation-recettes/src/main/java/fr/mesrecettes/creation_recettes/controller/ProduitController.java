package fr.mesrecettes.creation_recettes.controller;

import fr.mesrecettes.creation_recettes.model.Produit;
import fr.mesrecettes.creation_recettes.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/produit/{id}")
    public ResponseEntity<Produit> getProduitById(@PathVariable("id") int id) {
        Produit produitById = produitService.getProduitById(id);
        return ResponseEntity.ok(produitById);
    }
}
