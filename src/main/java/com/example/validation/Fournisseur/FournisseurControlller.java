package com.example.validation.Fournisseur;

import com.example.validation.entities.Fournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurControlller {
    @Autowired
    Ifournisseur ifournisseur;
    @GetMapping
    List<Fournisseur> retrieveAllFournisseurs(){
        return  ifournisseur.retrieveAllFournisseurs();

    }
    @PostMapping
    Fournisseur addFournisseur (@RequestBody Fournisseur f){
        return  ifournisseur.addFournisseur(f);

    }
    @PutMapping
    Fournisseur updateFournisseur (@RequestBody Fournisseur f){
        return ifournisseur.updateFournisseur(f);
    }
    @GetMapping("/search/{id}")
    Fournisseur retrieveFournisseur (@PathVariable(value = "id") Long id){
        return ifournisseur.retrieveFournisseur(id);
    }
    @PutMapping("/assignit/{id1}/{id2}")
    public void assignSecteurActiviteToFournisseur(@PathVariable(value = "id1") Long fournisseurId, @PathVariable(value = "id2") Long secteurActiviteId){
         ifournisseur.assignSecteurActiviteToFournisseur(fournisseurId,secteurActiviteId);
    }
}
