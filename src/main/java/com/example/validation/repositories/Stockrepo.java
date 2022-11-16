package com.example.validation.repositories;

import com.example.validation.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Stockrepo extends JpaRepository<Stock,Long> {
}
