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
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idOperateur;
    private  String nom;
    private  String prenom;
    private String password;

    @OneToMany()
    private Set<Facture> factureSet;
}
