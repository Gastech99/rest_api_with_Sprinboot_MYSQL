package com.apirest.demo.services;

import com.apirest.demo.modele.Produit;
import com.apirest.demo.repositories.ProduitRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ProduitServiceImpl implements ProduitService{

    private final ProduitRepo produitRepo;

    @Override
    public Produit creer(Produit produit) {
        return produitRepo.save(produit);
    }

    @Override
    public List<Produit> lire() {
        return produitRepo.findAll();
    }

    @Override
    public Produit modifier(Long id, Produit produit) {
        return produitRepo.findById(id)
                .map(p-> {
                    p.setPrix(produit.getPrix());
                    p.setNom(produit.getNom());
                    p.setDescription(produit.getDescription());

                    return produitRepo.save(p);
                }).orElseThrow(() -> new RuntimeException("Produit non trouvé !"));
    }

    @Override
    public String supprimer(Long id) {
        produitRepo.deleteById(id);
        String message = "Produit supprimé avec succès";
        return message;
    }
}
