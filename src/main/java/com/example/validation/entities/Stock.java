package com.example.validation.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private int qte;
    private int qtemin;
    private String libelleStock;

    @OneToMany(mappedBy = "stock")
    @JsonIgnoreProperties("stock")
    private Set<Produit> produits;



}
