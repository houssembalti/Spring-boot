package com.example.validation.Produit;

import com.example.validation.Generic.GenericController;
import com.example.validation.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produit")
public class ProduitRestcontroller extends GenericController<Produit,Long> {
    @Autowired
    Iproduit iproduit;
    @PutMapping("/assign/{id}/{id2}")
    public void assignProduitToStock(@PathVariable(value = "id") Long idProduit, @PathVariable(value = "id2") Long idStock){
        iproduit.assignProduitToStock(idProduit,idStock);
    }
}
