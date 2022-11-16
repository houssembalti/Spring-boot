package com.example.validation.Produit;

import com.example.validation.Generic.IGeneric;
import com.example.validation.entities.Produit;

public interface Iproduit extends IGeneric<Produit,Long> {

    void assignProduitToStock(Long idProduit, Long idStock);
}
