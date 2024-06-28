package fr.mesrecettes.creation_recettes.model;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "recette")
public class Recette {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String nom;

    @Column(length = 200)
    private String description;

    @Column(length = 255)
    private String image;

    @ManyToMany
    @JoinTable(
            name = "recette_produit",
            joinColumns = @JoinColumn(name = "recette_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id"))
    private Set<Produit> produits;

    @OneToMany(mappedBy = "recette")
    private Set<Commentaire> commentaires;

    // Getters and Setters
}
