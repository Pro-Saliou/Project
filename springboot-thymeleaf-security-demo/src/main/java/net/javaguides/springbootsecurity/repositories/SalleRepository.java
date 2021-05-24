package net.javaguides.springbootsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springbootsecurity.entities.Salle;

public interface SalleRepository extends JpaRepository<Salle, Long> {

}