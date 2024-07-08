package fr.mesrecettes.creation_recettes.service;

import fr.mesrecettes.creation_recettes.model.Produit;
import fr.mesrecettes.creation_recettes.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {

    @Autowired
    ProduitRepository produitsRepository;

    public List<Produit> getAllProduit() {
        return (List<Produit>) produitsRepository.findAll();
    }
}
