package net.javaguides.springbootsecurity.repositories;

import org.springframework.data.repository.CrudRepository;

import net.javaguides.springbootsecurity.entities.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant, Long>{

}
