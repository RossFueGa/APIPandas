package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ross
 */
public interface RepositoryPanda extends JpaRepository<Panda, String> {
    
}
