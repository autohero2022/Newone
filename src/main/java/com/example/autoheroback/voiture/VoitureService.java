package com.example.autoheroback.voiture;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class VoitureService {

    private VoitureRepository voitureRepository;

    public VoitureService() {
    }

    public VoitureService(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    public Voiture getVoiture(final Long id) {
        return voitureRepository.findByVoitureid(id);
    }

    public List<Voiture> getAllVoiture() {
        return voitureRepository.findAll();
    }

        public Voiture save(Voiture voiture) {
          return voitureRepository.save(voiture) ;
        }
}
