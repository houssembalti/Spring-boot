package com.example.validation.repositories;

import com.example.validation.entities.Facture;
import com.example.validation.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Fournisseurrepo extends JpaRepository<Fournisseur,Long> {

}
