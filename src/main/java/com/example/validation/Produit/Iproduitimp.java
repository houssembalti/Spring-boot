package com.example.validation.Produit;

import com.example.validation.Generic.IGenericimp;
import com.example.validation.entities.Produit;
import com.example.validation.entities.Stock;
import com.example.validation.repositories.Produitrepo;
import com.example.validation.repositories.Stockrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Iproduitimp extends IGenericimp<Produit,Long> implements  Iproduit {
    @Autowired
    Produitrepo produitrepo;
    @Autowired
    Stockrepo stockrepo;
    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
            Produit p= produitrepo.findById(idProduit).orElse(null);
            Stock s=stockrepo.findById(idStock).orElse(null);
            if (p!=null && s!=null){
            p.setStock(s);
            produitrepo.save(p);}

    }

}
