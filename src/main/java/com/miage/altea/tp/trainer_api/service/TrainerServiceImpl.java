package com.miage.altea.tp.trainer_api.service;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import com.miage.altea.tp.trainer_api.repository.TrainerRepository;

// TODO
public class TrainerServiceImpl implements TrainerService { 

    private TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public Iterable<Trainer> getAllTrainers() {
        return this.trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainer(String name) {
        return this.trainerRepository.findById(name).isPresent() ? this.trainerRepository.findById(name).get() : null;
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        return this.trainerRepository.save(trainer);
    }
}