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
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;
    private  String codeFournisseur;
    private  String  libellefournisseur;
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;

    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;

    @OneToOne()
    private DetailFournisseur detailFournisseur;

    @ManyToMany()
    private  Set<SecteurActivite> secteurActiviteSET;
}
