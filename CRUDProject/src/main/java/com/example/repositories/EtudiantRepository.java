package com.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant, Long>{

}
