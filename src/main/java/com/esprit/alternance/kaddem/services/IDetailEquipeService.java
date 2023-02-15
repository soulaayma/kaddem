package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {


    List<DetailEquipe> retrieveAllDetailEquipes();

    DetailEquipe addDetailEquipe(DetailEquipe e);

    DetailEquipe updateDetailEquipe (DetailEquipe e);

    DetailEquipe retrieveDetailEquipe (Integer idDetailEquipe);

    void deleteDetailEquipe(Integer idDetailEquipe);
}
