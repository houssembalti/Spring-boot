package com.example.validation.repositories;

import com.example.validation.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produitrepo extends JpaRepository<Produit,Long> {
}
