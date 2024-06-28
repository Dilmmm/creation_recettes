package fr.mesrecettes.creation_recettes.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 10)
    private String pseudo;

    @Column(nullable = false, unique = true, length = 25)
    private String email;

    @Column(nullable = false, length = 60)
    private String motDePasse;

    @Column(nullable = false, length = 30)
    private String prenom;

    @Column(nullable = false, length = 30)
    private String nom;

    @Column(nullable = false)
    private LocalDateTime dateInscription = LocalDateTime.now();

    @Column(nullable = false)
    private Boolean actif = true;

    // Getters and Setters
}
