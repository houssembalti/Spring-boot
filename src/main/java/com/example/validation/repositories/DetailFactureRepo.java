package com.example.validation.repositories;

import com.example.validation.entities.DetailFacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFactureRepo extends JpaRepository<DetailFacture,Long> {
}
