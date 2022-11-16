package com.example.validation.repositories;

import com.example.validation.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Facturerepo extends JpaRepository<Facture,Long> {
    List<Facture> getFacturesByFournisseur_IdFournisseur(Long idFournisseur);
}
