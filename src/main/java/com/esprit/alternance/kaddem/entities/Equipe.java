package com.esprit.alternance.kaddem.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "Equipe")
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe")
    private Integer idEquipe;

    private String nomEquipe;

    @Enumerated(EnumType.ORDINAL)
    private Niveau niveau;
}
