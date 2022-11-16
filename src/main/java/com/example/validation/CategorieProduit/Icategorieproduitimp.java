package com.example.validation.CategorieProduit;

import com.example.validation.entities.CategorieProduit;
import com.example.validation.repositories.Categorieproduitrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Icategorieproduitimp implements IcategorieProduit{
    @Autowired
    Categorieproduitrepo categorieproduitrepo;
    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return categorieproduitrepo.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return categorieproduitrepo.save(cp);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        if (categorieproduitrepo.existsById(cp.getIdCategorieProduit())){
            return categorieproduitrepo.save(cp);
        }
        else return null;
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        return categorieproduitrepo.findById(id).orElse(null);
    }

    @Override
    public void removeCategorieProduit(Long id) {
        categorieproduitrepo.deleteById(id);

    }
}
