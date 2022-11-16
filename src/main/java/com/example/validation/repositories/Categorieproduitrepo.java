package com.example.validation.repositories;

import com.example.validation.entities.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categorieproduitrepo extends JpaRepository<CategorieProduit,Long> {
}
