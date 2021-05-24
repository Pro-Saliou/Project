package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Message;

/**
 * @author Mouhamadou Saliou Diallo 
 *
 */
public interface MessageRepository extends JpaRepository<Message, Integer>{

}