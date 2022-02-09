package com.github.rozumek29.codeforgreenapi.controllers;

import com.github.rozumek29.codeforgreenapi.models.Plant;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PlantsController {

    List<Plant> plantList = new ArrayList<>();

    @CrossOrigin("*")
    @GetMapping("/api/getallplants")
    public List<Plant> getAllPlants(){
        return this.plantList;
    }

    @CrossOrigin("*")
    @PostMapping("/api/addPlant")
    public Boolean addPlant(@RequestBody Plant plant){
        return plantList.add(plant);
    }

    @CrossOrigin("*")
    @GetMapping("/api/getPlantByIndex")
    public Plant getByIndex(@RequestParam int index){
        if (index > this.plantList.size()-1){
            return null;
        }
        return this.plantList.get(index);
    }

}
