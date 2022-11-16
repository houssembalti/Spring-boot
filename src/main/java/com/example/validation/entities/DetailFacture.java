package com.example.validation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private int qtCcommande;
    private float prixtotaldetail;
    private int pourcentageremise;
    private float montantremise;

    @ManyToOne()
    private  Facture facture;

    @ManyToOne()
    private Produit produit2;



}
