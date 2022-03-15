package com.github.rozumek29.codeforgreenapi.services;

import com.github.rozumek29.codeforgreenapi.models.Plant;
import com.github.rozumek29.codeforgreenapi.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlantService{

    @Autowired
    PlantRepository repository;

    public Optional<Plant> search(String keyword){
        return repository.findbyQuery(keyword);
    }

    public Iterable<Plant> findAll(){
        return repository.findAll();
    }

    public Optional<Plant> findById(Long id){
        return repository.findById(id);
    }


}
