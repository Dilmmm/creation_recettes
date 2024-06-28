package fr.mesrecettes.creation_recettes.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@Entity
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String nom;

    @Column(length = 200)
    private String description;

    @Column(length = 255)
    private String image;

    @ManyToOne
    @JoinColumn(name = "categorie_id", nullable = false)
    private Categorie categorie;

    @ManyToMany(mappedBy = "produits")
    private Set<Recette> recettes;
}
