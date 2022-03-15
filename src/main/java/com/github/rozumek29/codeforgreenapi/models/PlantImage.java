package com.github.rozumek29.codeforgreenapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plant_images")
@Getter @Setter @NoArgsConstructor
public class PlantImage {

    @Id
    private Long id;

    private String img_name;

    public PlantImage(String img_name){
        this.img_name = img_name;
    }

    @Override
    public String toString() {
        return this.img_name;
    }
}