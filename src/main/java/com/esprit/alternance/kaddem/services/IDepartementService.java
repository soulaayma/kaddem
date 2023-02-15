package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.entities.Departements;

import java.util.List;

public interface IDepartementService {

    List<Departements> retrieveAllDepartments();

    Departements addDepartment(Departements e);

    Departements updateDepartment (Departements e);

    Departements retrieveDepartment (Integer idDepartment);

    void deleteDepartment(Integer idDepartment);
}
