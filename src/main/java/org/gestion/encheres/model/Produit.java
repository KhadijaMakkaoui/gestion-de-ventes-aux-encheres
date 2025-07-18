package org.gestion.encheres.model;

import jakarta.persistence.*;

@Entity
public class Produit {
    @Id
    @GeneratedValue
    private Long id;

    String libelle;
    String prix;
    @Enumerated(EnumType.STRING)
    Status status;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
