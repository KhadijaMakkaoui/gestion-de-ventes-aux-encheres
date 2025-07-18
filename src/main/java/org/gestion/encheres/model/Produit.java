package org.gestion.encheres.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Produit {
    @Id
    @GeneratedValue
    private Long id;

    private String libelle;
    private String prix;
    private String status;

    @OneToMany(mappedBy = "produit")
    private List<Encherir> encheres;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Encherir> getEncheres() {
        return encheres;
    }

    public void setEncheres(List<Encherir> encheres) {
        this.encheres = encheres;
    }
}
