package org.gestion.encheres.repository;

import org.gestion.encheres.model.Produit;
import org.springframework.data.repository.CrudRepository;

public interface ProduitRepo extends CrudRepository<Produit, Integer> {
}
