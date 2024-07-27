package com.rolf.sports_fun.controllers;


import com.rolf.sports_fun.dto.CreateSportRequest;
import com.rolf.sports_fun.entities.SportEntity;
import com.rolf.sports_fun.repositories.SportRepository;
import com.rolf.sports_fun.services.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sport")
public class SportController {
    private final SportService sportService;

    @Autowired
    public SportController(SportRepository sportRepository, SportService sportService) {
        this.sportService = sportService;
    }

    @GetMapping
    public List<SportEntity> getAllSports() {
        return sportService.getAllSports();
    }

    @PostMapping
    public SportEntity createSport(@RequestBody CreateSportRequest sport) {
        return sportService.createSport(sport);
    }
}
