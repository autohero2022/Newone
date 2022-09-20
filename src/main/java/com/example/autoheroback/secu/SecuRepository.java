package com.example.autoheroback.secu;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecuRepository extends JpaRepository<Secu, Integer> {
    Secu findByIdvoiture(int id);
}
