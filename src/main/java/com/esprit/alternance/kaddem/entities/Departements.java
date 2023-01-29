package com.esprit.alternance.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Departements")
public class Departements implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Integer idDepart; // Clé primaire
    private String nomDepart;

}
