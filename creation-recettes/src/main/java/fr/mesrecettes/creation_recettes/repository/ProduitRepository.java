package fr.mesrecettes.creation_recettes.repository;

import fr.mesrecettes.creation_recettes.model.Produit;
import org.springframework.data.repository.CrudRepository;

public interface ProduitRepository extends CrudRepository <Produit, Integer> {
}
