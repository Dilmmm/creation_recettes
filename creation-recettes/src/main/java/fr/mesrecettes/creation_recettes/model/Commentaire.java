package fr.mesrecettes.creation_recettes.model;
import jakarta.persistence.*;

@Entity
@Table(name = "commentaire")
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 10)
    private String auteur;

    @Column(length = 20)
    private String titre;

    @Column(length = 200)
    private String texte;

    @Column(nullable = false)
    private Integer note;

    @ManyToOne
    @JoinColumn(name = "recette_id", nullable = false)
    private Recette recette;

    // Getters and Setters
}
