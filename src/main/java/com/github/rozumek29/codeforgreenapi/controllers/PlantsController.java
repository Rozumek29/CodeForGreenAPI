package com.github.rozumek29.codeforgreenapi.controllers;

import com.github.rozumek29.codeforgreenapi.models.Plant;
import com.github.rozumek29.codeforgreenapi.repository.PlantRepository;
import com.github.rozumek29.codeforgreenapi.services.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
public class PlantsController {

    @Autowired
    PlantService service;

    @CrossOrigin("*")
    @GetMapping("/api/getAllPlants")
    public Iterable<Plant> getAllPlants(){
        return this.service.findAll();
    }

    @CrossOrigin("*")
    @GetMapping("/api/getPlantById")
    public Optional<Plant> getById(@RequestParam(value = "id", required = true) long id){
        return this.service.findById(id);
    }

    @CrossOrigin("*")
    @GetMapping("/api/findByKeyword")
    public Iterable<Plant> findPlant(@RequestParam(value = "keyword", required = true) String keyword){
        return this.service.search(keyword);
    }

}
