package com.example.autoheroback.diaporama;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaporamaRepository extends JpaRepository<Diaporama, Integer> {
    Diaporama findByIdvoiture(int id);
}
