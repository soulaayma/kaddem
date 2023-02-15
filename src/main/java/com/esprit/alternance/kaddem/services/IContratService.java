package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Contrat;

import java.util.List;

public interface IContratService {

    List<Contrat> retrieveAllContrats();

    Contrat addContrat(Contrat e);

    Contrat updateContrat (Contrat e);

    Contrat retrieveContrat (Integer idContrat);

    void deleteContrat(Integer idContrat);
}
