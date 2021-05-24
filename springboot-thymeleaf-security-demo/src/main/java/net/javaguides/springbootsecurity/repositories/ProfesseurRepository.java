package net.javaguides.springbootsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springbootsecurity.entities.Professeur;

public interface ProfesseurRepository extends JpaRepository<Professeur, Long>{

}
