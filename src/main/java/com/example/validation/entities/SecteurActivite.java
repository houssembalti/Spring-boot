package com.example.validation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idSecteurActivite;
    private  String codesecteuractivie;
    private String libelleSecteurActivite;
    @ManyToMany(mappedBy = "secteurActiviteSET")
    private Set<Fournisseur> fournisseurss;
}
