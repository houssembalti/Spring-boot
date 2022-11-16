package com.example.validation.Fournisseur;

import com.example.validation.entities.DetailFournisseur;
import com.example.validation.entities.Fournisseur;
import com.example.validation.entities.SecteurActivite;
import com.example.validation.repositories.DetailFournisseurrepo;
import com.example.validation.repositories.Fournisseurrepo;
import com.example.validation.repositories.SecteurActiviterepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class Ifournisseurimp implements Ifournisseur {
    @Autowired
    Fournisseurrepo fournisseurrepo;
    @Autowired
    DetailFournisseurrepo detailFournisseurrepo;
    @Autowired
    SecteurActiviterepo secteurActiviterepo;
    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurrepo.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        if (f.getDetailFournisseur()!=null){
                detailFournisseurrepo.save(f.getDetailFournisseur());
        }
        return  fournisseurrepo.save(f);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurrepo.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurrepo.findById(id).orElse(null);
    }

    @Override
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur f= fournisseurrepo.findById(fournisseurId).orElse(null);
        SecteurActivite sec = secteurActiviterepo.findById(secteurActiviteId).orElse(null);

        if(f!=null && sec!=null){
            if (f.getSecteurActiviteSET()==null){
                Set<SecteurActivite> sets = new HashSet<>();
                sets.add(sec);
                f.setSecteurActiviteSET(sets);
                fournisseurrepo.save(f);
            }
            else{
                f.getSecteurActiviteSET().add(sec);
                fournisseurrepo.save(f);
            }


        }

    }
}
