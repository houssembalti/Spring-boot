package com.example.validation.Facture;

import com.example.validation.entities.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {
    @Autowired
    Ifacture ifacture;
    @GetMapping
    List<Facture> retrieveAllFactures(){
       return ifacture.retrieveAllFactures();
    }
    @PutMapping("/cancel/{id}")
    void cancelFacture(@PathVariable(value = "id") Long id){
         ifacture.cancelFacture(id);
    }
    @GetMapping("/search/{id}")
    Facture retrieveFacture(@PathVariable(value = "id") Long id){
        return ifacture.retrieveFacture(id);
    }

    @PostMapping
    public  Facture addit(@RequestBody Facture fac){
        return ifacture.addit(fac);
    }
    @GetMapping("/getby/{id}")
    public List<Facture> getFacturesByFournisseur(@PathVariable(value = "id") Long idFournisseur){
        return  ifacture.getFacturesByFournisseur(idFournisseur);
    }
}
