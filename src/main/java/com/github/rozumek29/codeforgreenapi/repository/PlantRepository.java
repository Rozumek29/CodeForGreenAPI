package com.github.rozumek29.codeforgreenapi.repository;

import com.github.rozumek29.codeforgreenapi.models.Plant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlantRepository extends CrudRepository<Plant, Long> {

    @Query(value = "SELECT * FROM plants WHERE polish_name LIKE %?1% OR polish_family LIKE %?1% OR latin_name LIKE %?1% OR latin_family LIKE %?1%", nativeQuery = true)
    Iterable<Plant> findbyQuery(@Param("keyword") String keyword);

}
