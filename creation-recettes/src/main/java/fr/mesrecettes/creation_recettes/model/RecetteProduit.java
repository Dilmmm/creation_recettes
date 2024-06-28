package fr.mesrecettes.creation_recettes.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "recette_produit")
@IdClass(RecetteProduitId.class)
public class RecetteProduit {

    @Id
    @ManyToOne
    @JoinColumn(name = "recette_id")
    private Recette recette;

    @Id
    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    // Getters and Setters
}

class RecetteProduitId implements Serializable {
    private Integer recette;
    private Integer produit;

    // Getters, Setters, equals() and hashCode()
}
