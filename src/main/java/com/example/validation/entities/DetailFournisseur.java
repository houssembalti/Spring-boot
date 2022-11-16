package com.example.validation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idDetailFournisseur;
    private Date datedebutcolloraboration;
    private String adresse;
    private  String matricule;

@OneToOne(mappedBy = "detailFournisseur")
    private  Fournisseur fournisseur1;
}
