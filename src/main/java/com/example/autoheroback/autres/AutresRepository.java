package com.example.autoheroback.autres;

import com.example.autoheroback.voiture.Voituredescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutresRepository extends JpaRepository<Autres, Integer> {

    Autres findByIdvoiture(int id);
}
