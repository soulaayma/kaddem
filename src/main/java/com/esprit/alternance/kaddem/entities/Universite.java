package com.esprit.alternance.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Universite")
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniv")
    private Integer idUniv;

    private String nomUniv;

}
