package com.example.autoheroback.eclairage;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EclairageRepository extends JpaRepository<Eclairage, Integer> {
    Eclairage findByIdvoiture(int id);
}
