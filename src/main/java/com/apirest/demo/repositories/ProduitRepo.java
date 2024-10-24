package com.apirest.demo.repositories;

import com.apirest.demo.modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepo extends JpaRepository<Produit, Long> {

}
