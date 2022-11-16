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
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private  float prix;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Temporal(TemporalType.TIMESTAMP)
    private  Date dernieredatemodification;

    @ManyToOne()
    private  Stock stock;

    @ManyToOne()
    private CategorieProduit categorieProduit;
    @OneToMany(mappedBy = "produit2")
    private Set<DetailFacture> detailFacturess;


}
