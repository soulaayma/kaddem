package com.esprit.alternance.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "DetailEquipe")
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailEquipe")
    private Integer idDetailEquipe;

    private Integer salle;

    private String thematique;
}
