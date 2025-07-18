package org.gestion.encheres.controller;

import org.gestion.encheres.model.Client;
import org.gestion.encheres.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepo clientRepo;

    @PostMapping
    public Client ajouterClient(@RequestBody Client client) {
        return clientRepo.save(client);
    }
}
