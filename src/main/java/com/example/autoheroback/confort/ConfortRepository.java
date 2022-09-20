package com.example.autoheroback.confort;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConfortRepository extends JpaRepository<Confort, Integer> {
    Confort findByIdvoiture(int id);
}
