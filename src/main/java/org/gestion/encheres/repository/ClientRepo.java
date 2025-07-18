package org.gestion.encheres.repository;

import org.gestion.encheres.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client, Integer> {
}
