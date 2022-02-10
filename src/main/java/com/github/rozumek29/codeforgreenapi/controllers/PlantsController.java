package com.github.rozumek29.codeforgreenapi.controllers;

import com.github.rozumek29.codeforgreenapi.models.Plant;
import com.github.rozumek29.codeforgreenapi.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PlantsController {

    @Autowired
    PlantRepository plantRepository;

    @CrossOrigin("*")
    @GetMapping("/api/getallplants")
    public Iterable<Plant> getAllPlants(){
        return this.plantRepository.findAll();
    }

    @CrossOrigin("*")
    @PostMapping("/api/addPlant")
    public Boolean addPlant(@RequestBody Plant plant){
        plantRepository.save(plant);
        return true;
    }

    @CrossOrigin("*")
    @GetMapping("/api/getPlantById")
    public Optional<Plant> getById(@RequestParam(value = "id", required = true) long id){
        return plantRepository.findById(id);
    }

    @CrossOrigin("*")
    @DeleteMapping("/api/removePlantById")
    public Boolean removePlant(@RequestParam(value = "id", required = true) long id){
        plantRepository.deleteById(id);
        return true;
    }

}
