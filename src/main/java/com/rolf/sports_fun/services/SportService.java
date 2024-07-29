package com.rolf.sports_fun.services;

import com.rolf.sports_fun.dto.CreateSportRequest;
import com.rolf.sports_fun.entities.SportEntity;
import com.rolf.sports_fun.repositories.SportRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SportService {
    private final SportRepository sportRepository;

    // Constructor injection
    public SportService(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    public List<SportEntity> getAllSports() {
        return sportRepository.findAll();
    }

    @Transactional
    public SportEntity createSport(CreateSportRequest sport) {
        SportEntity new_sport = new SportEntity();
        new_sport.setName(sport.getName());
        new_sport.setDescription(sport.getDescription());

        return sportRepository.addSport(new_sport);
    }

}
