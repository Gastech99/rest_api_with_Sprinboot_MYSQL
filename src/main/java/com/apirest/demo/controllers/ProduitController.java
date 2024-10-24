package com.apirest.demo.controllers;

import com.apirest.demo.modele.Produit;
import com.apirest.demo.services.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produit")
@AllArgsConstructor

public class ProduitController {
    private final ProduitService produitService;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.creer(produit);
    }

    @GetMapping("/read")
    public List<Produit> read(){
        return produitService.lire();
    }

    @PutMapping("/update")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit){
        return produitService.modifier(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return produitService.supprimer(id);
    }
}
