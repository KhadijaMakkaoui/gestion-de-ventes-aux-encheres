package org.gestion.encheres.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Produit {
    @Id
    @GeneratedValue
    private Long id;

    String libelle;
    String prix;
    @Enumerated(EnumType.STRING)
    Status status;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "vendeur_id")
    private Client vendeur;

    @OneToMany(mappedBy = "article")
    private List<Encherir> encheres;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
