package com.example.validation.CategorieProduit;

import com.example.validation.entities.CategorieProduit;

import java.util.List;

public interface IcategorieProduit {
    public List<CategorieProduit> retrieveAllCategorieProduits();

    public CategorieProduit addCategorieProduit(CategorieProduit cp);

    public CategorieProduit updateCategorieProduit(CategorieProduit cp);

    public CategorieProduit retrieveCategorieProduit(Long id);

    public void removeCategorieProduit(Long id);
}
