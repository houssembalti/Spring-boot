package com.example.validation.CategorieProduit;

import com.example.validation.entities.CategorieProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorieproduit")
public class CategorieproduitController {
    @Autowired
    IcategorieProduit icategorieProduit;
    @GetMapping
    public List<CategorieProduit> retrieveAllCategorieProduits(){
        return  icategorieProduit.retrieveAllCategorieProduits();
    }
    @PostMapping
    public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp){
        return  icategorieProduit.addCategorieProduit(cp);
    }
    @PutMapping
    public CategorieProduit updateCategorieProduit(@RequestBody CategorieProduit cp){
        return icategorieProduit.updateCategorieProduit(cp);
    }
    @GetMapping("/search/{id}")
    public CategorieProduit retrieveCategorieProduit(@PathVariable(value = "id") Long id){
        return icategorieProduit.retrieveCategorieProduit(id);

    }
    @DeleteMapping("/{id}")
    public void removeCategorieProduit(@PathVariable(value = "id") Long id){
        icategorieProduit.removeCategorieProduit(id);

    }

}
