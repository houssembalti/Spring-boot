package com.example.validation.repositories;

import com.example.validation.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Stockrepo extends JpaRepository<Stock,Long> {


    @Query("select s from Stock s where s.qte<s.qtemin")
    List<Stock> getAllConcernedStocks();
}
