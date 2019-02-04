package com.miage.altea.tp.trainer_api.controller;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import com.miage.altea.tp.trainer_api.service.TrainerService;

public class TrainerController {

    private final TrainerService trainerService;

    TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    Iterable<Trainer> getAllTrainers(){
        return this.trainerService.getAllTrainers();
    }

    Trainer getTrainer(String name){
        return this.trainerService.getTrainer(name);
    }

}