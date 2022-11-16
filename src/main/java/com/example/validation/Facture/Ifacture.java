package com.example.validation.Facture;

import com.example.validation.entities.Facture;

import java.util.List;

public interface Ifacture {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);

    public  Facture addit(Facture fac);

    List<Facture> getFacturesByFournisseur(Long idFournisseur);
}
