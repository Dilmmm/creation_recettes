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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Set<Recette> getRecettes() {
        return recettes;
    }

    public void setRecettes(Set<Recette> recettes) {
        this.recettes = recettes;
    }
}
