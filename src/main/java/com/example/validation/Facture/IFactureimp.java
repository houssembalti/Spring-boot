package com.example.validation.Facture;

import com.example.validation.entities.Facture;
import com.example.validation.repositories.Facturerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IFactureimp implements  Ifacture{

    @Autowired
    Facturerepo facturerepo;
    @Override
    public List<Facture> retrieveAllFactures() {
        return facturerepo.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        Facture f = facturerepo.findById(id).orElse(null);
        if (f!=null){
            f.setArchive(true);
            facturerepo.save(f);
        }

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return facturerepo.findById(id).orElse(null);
    }

    @Override
    public Facture addit(Facture fac) {
        return facturerepo.save(fac);
    }

    @Override
    public List<Facture> getFacturesByFournisseur(Long idFournisseur) {
        return facturerepo.getFacturesByFournisseur_IdFournisseur(idFournisseur);
    }
}
