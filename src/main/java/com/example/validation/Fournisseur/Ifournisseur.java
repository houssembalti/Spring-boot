package com.example.validation.Fournisseur;

import com.example.validation.entities.Fournisseur;

import java.util.List;

public interface Ifournisseur {
    List<Fournisseur> retrieveAllFournisseurs();
    Fournisseur addFournisseur (Fournisseur f);
    Fournisseur updateFournisseur (Fournisseur f);
    Fournisseur retrieveFournisseur (Long id);
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long
            secteurActiviteId) ;
}
