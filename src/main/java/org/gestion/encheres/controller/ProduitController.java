package org.gestion.encheres.controller;
import org.gestion.encheres.model.Produit;
import org.gestion.encheres.repository.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produits")
public class ProduitController {

    @Autowired
    private ProduitRepo produitRepo;

    @PostMapping
    public Produit ajouterProduit(@RequestBody Produit produit) {
        return produitRepo.save(produit);
    }
}
