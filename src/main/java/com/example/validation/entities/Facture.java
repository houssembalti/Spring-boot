package com.example.validation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;
    private float montantremise;
    private float montantFacture;
    private Date datecreationfacture;
    private Date dernieremodification;
    private boolean archive;
    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;

    @OneToMany(mappedBy = "facture1")
    private Set<Reglement> reglements;
    @ManyToOne()
    private Fournisseur fournisseur;




}
