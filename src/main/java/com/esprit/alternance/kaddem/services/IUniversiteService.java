package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    List<Universite> retrieveAllUniversites();

    Universite addUniversite(Universite e);

    Universite updateUniversite (Universite e);

    Universite retrieveUniversite (Integer idUniversite);

    void deleteUniversite(Integer idUniversite);

}
