package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.repositories.equipeRepository;
import com.esprit.alternance.kaddem.repositories.etudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service

public class EtudiantServiceImp implements IEquipeService{

    etudiantRepository etRepository;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return etRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return etRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return etRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return etRepository.findById(idEquipe).get();
    }
}
