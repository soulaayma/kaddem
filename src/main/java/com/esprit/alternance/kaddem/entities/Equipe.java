package com.esprit.alternance.kaddem.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "Equipe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe")
    private Integer idEquipe;

    private String nomEquipe;

    @Enumerated(EnumType.ORDINAL)
    private Niveau niveau;

    @OneToOne
    private DetailEquipe detail_equipe ;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;





}
