package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Professeur;

public interface ProfesseurRepository extends JpaRepository<Professeur, Long>{

}
