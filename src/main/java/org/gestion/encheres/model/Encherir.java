package org.gestion.encheres.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Encherir {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;
    private float prix;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Produit produit;

    public Encherir() {
    }

    public Encherir(Long id, LocalDate date, float prix) {
        this.id = id;
        this.date = date;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}
