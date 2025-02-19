package com.example.demo.repository;

import com.example.demo.modelo.Estudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudentRepository extends JpaRepository<Estudent, Long> {
    
}
