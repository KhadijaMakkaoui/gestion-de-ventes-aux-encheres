package org.gestion.encheres.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Encherir {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private float prix;

    public Encherir() {
    }

    public Encherir(Long id, Date date, float prix) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
