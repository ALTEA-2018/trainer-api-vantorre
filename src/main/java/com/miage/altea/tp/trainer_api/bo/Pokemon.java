package com.miage.altea.tp.trainer_api.bo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// TODO
@Data
@Entity
public class Pokemon {

    @Id
    @GeneratedValue
    private int id; 

    private int pokemonType; 

    private int level; 

    public Pokemon() {
    }

    public Pokemon(int pokemonType, int level) {
        this.pokemonType = pokemonType;
        this.level = level;
    }

    //[...]
}