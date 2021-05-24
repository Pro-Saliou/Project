package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Salle;

public interface SalleRepository extends JpaRepository<Salle, Long> {

}