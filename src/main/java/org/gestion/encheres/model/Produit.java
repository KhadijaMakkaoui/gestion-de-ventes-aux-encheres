package org.gestion.encheres.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private String imageUrl;

    private double prixInitial;
    private double prixActuel;

    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "vendeur_id")
    private Client vendeur;

    @OneToMany(mappedBy = "produit")
    private List<Encherir> encheres;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
