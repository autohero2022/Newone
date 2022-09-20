package com.example.autoheroback.pointsforts;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface pointsfortsRepository extends JpaRepository<Pointsforts, Integer> {
    Pointsforts findByIdvoiture(int id);
}
