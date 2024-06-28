package fr.mesrecettes.creation_recettes.model;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categorie")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String nom;

    @OneToMany(mappedBy = "categorie")
    private Set<Produit> produits;

    // Getters and Setters
}
