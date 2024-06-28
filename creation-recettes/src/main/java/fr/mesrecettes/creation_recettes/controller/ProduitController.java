package fr.mesrecettes.creation_recettes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitController {

    @RequestMapping("/produit")
    public String produit(){
        return "Hello !";
    }
}
