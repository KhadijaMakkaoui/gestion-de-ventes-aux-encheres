package org.gestion.encheres.controller;
import org.gestion.encheres.model.Client;
import org.gestion.encheres.model.Encherir;
import org.gestion.encheres.model.Produit;
import org.gestion.encheres.repository.ClientRepo;
import org.gestion.encheres.repository.EncherirRepo;
import org.gestion.encheres.repository.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/encheres")
public class EncherirController {

    @Autowired private EncherirRepo enchereRepo;
    @Autowired private ProduitRepo produitRepo;
    @Autowired private ClientRepo clientRepo;

    @PostMapping
    public Encherir ajouterEnchere(@RequestParam int clientId,
                                   @RequestParam int produitId) {
        Client client = clientRepo.findById(clientId).orElseThrow();
        Produit produit = produitRepo.findById(produitId).orElseThrow();

        produitRepo.save(produit);

        Encherir enchere = new Encherir();
        enchere.setClient(client);
        enchere.setProduit(produit);
        enchere.setDate(LocalDate.now());

        return enchereRepo.save(enchere);
    }

    @GetMapping
    public List<Encherir> listeEncheres() {
        return (List<Encherir>) enchereRepo.findAll();
    }
}

