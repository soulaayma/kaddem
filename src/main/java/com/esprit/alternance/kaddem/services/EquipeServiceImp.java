package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.repositories.equipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service

public class EquipeServiceImp implements IEquipeService{

    equipeRepository Eqrepository;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return Eqrepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return Eqrepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return Eqrepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return Eqrepository.findById(idEquipe).get();
    }
}
