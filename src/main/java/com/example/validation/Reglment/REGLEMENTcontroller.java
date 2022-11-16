package com.example.validation.Reglment;

import com.example.validation.Generic.GenericController;
import com.example.validation.entities.Reglement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reglement")
public class REGLEMENTcontroller extends GenericController<Reglement,Long> {
    Ireglement ireglement;
        @GetMapping("/getfact/{id}")
    public List<Reglement> retrieveReglementByFacture(@PathVariable(value = "id") Long idFacture){
        return  ireglement.retrieveReglementByFacture(idFacture);
    }
}
