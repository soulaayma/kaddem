package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.entities.Equipe;
import com.esprit.alternance.kaddem.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface etudiantRepository extends JpaRepository<Equipe, Integer> {


    @Query
    List<Etudiant> findEtudiantByDepartmentIdDepartment(Integer departmentId);

    @Query
    List<Etudiant> findByEquipesNiveauExpert();

}
