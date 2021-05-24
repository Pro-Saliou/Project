package com.example.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entities.CustomUser;

/**
 * @author Mouhamadou Saliou Diallo
 *
 */
public interface CustomUserRepository extends JpaRepository<CustomUser, Integer>
{
    Optional<CustomUser> findByEmail(String email);
}