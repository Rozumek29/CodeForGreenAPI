package com.github.rozumek29.codeforgreenapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Plant {

    private String polishName;
    private String englishName;
    private String latinName;
    private String description;
}
