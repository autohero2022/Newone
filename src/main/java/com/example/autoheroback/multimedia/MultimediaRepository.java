package com.example.autoheroback.multimedia;

import com.example.autoheroback.autres.Autres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MultimediaRepository extends JpaRepository<Multimedia, Integer> {
    Multimedia findByIdvoiture(int id);
}
