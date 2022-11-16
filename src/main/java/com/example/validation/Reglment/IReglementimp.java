package com.example.validation.Reglment;

import com.example.validation.Generic.IGenericimp;
import com.example.validation.entities.Reglement;
import com.example.validation.repositories.Reglementrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IReglementimp extends IGenericimp<Reglement,Long> implements Ireglement {

    @Autowired
    Reglementrepo reglementrepo;
    @Override
    public List<Reglement> retrieveReglementByFacture(Long idFacture) {
        return reglementrepo.getReglementsByFacture1_IdFacture(idFacture);
    }
}
