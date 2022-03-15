package com.github.rozumek29.codeforgreenapi.repository;

import com.github.rozumek29.codeforgreenapi.models.Plant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlantRepository extends CrudRepository<Plant, Long> {

    @Query(value = "SELECT * FROM plants WHERE MATCH(latin_name, polish_name, latin_family, polish_family) "
            + "AGAINST (?1)", nativeQuery = true)
    Optional<Plant> findbyQuery(String keyword);

}
