package com.github.rozumek29.codeforgreenapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "plants")
public class Plant {

    @Id
    private Long id;

    private String polishName;
    private String latinName;
    private String polishFamily;
    private String latinFamily;
    private String decorativeness;
    private String plantUsage;
    private String description;
    @Column(insertable = false, updatable = false)
    private String plant_type;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "plant_id")
    private List<PlantImage> images;

    private String toxicity;
    private String lightConditions;
    private String subsoil;
    private String watering;

    private String sort;
    private String height;
    private String bark;
    private String shoots;
    private String leaves;
    private String flowers_desc;
    private LocalDate flowers_date;
    private String fruits_desc;
    private LocalDate fruits_date;
    private String origin;


}
