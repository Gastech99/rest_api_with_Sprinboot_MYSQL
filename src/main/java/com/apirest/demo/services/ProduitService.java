package com.apirest.demo.services;

import com.apirest.demo.modele.Produit;

import java.util.List;

public interface ProduitService {

    // Ce service prend quatre méthodes CRUD

    Produit creer (Produit produit);

    List<Produit> lire();

    Produit modifier (Long id, Produit produit);

    String supprimer (Long id);
}
