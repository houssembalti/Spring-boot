package com.example.validation.repositories;

import com.example.validation.entities.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Reglementrepo extends JpaRepository<Reglement,Long> {
List<Reglement> getReglementsByFacture1_IdFacture(Long idFacture);
}
