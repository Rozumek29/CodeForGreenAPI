package com.github.rozumek29.codeforgreenapi.repository;

import com.github.rozumek29.codeforgreenapi.models.Plant;
import org.springframework.data.repository.CrudRepository;

public interface PlantRepository extends CrudRepository<Plant, Long> {
}
