package org.gestion.encheres.service;

import org.gestion.encheres.model.Produit;
import org.gestion.encheres.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private ProduitRepository produitRepository;
    private ClientRepository userRepo;
    private CategorieRepository categorieRepo;

    public Produit ajouterProduit(Long vendeurId, Long categorieId, Produit article) {
        Utilisateur vendeur = userRepo.findById(vendeurId).orElseThrow();
        Categorie categorie = categorieRepo.findById(categorieId).orElseThrow();

        produit.setVendeur(vendeur);
        produit.setCategorie(categorie);
        produit.setPrixActuel(produit.getPrixInitial());
        produit.setDateDebut(LocalDateTime.now());
        produit.setDateFin(LocalDateTime.now().plusDays(3));

        return produitRepository.save(produit);
    }

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
}
