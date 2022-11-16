package com.example.validation.Reglment;

import com.example.validation.Generic.IGeneric;
import com.example.validation.entities.Reglement;

import java.util.List;

public interface Ireglement extends IGeneric<Reglement,Long> {
    public List<Reglement> retrieveReglementByFacture(Long idFacture);
}
