package com.github.rozumek29.codeforgreenapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.net.URL;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "plants")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "polishName")
    private String polishName;

    @Column(name = "englishName")
    private String englishName;

    @Column(name = "latinName")
    private String latinName;

    @Column(name = "origin")
    private String origin;

    @Column(name = "species")
    private String species;

    @Column(name = "family")
    private String family;

    @Column(name = "description")
    private String description;

    @Column(name = "img")
    private String img;
}
