package com.sport.net.service;

import com.sport.net.model.Training;

import java.util.List;

public interface TrainingService {

    List<Training> getAll();

    Training get(int id);

}
