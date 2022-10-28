package com.sport.net.service.impl;

import com.sport.net.dao.TrainingDao;
import com.sport.net.dao.impl.TrainingDaoImpl;
import com.sport.net.model.Training;
import com.sport.net.service.TrainingService;

import java.util.List;

public class TrainingServiceImpl implements TrainingService {

    TrainingDao trainingDao = new TrainingDaoImpl();


    @Override
    public List<Training> getAll() {
        return trainingDao.getAll();
    }

    @Override
    public Training get(int id) {
        for (Training training : getAll()) {
            if(training.getId() == id){
                return training;
            }
        }
        return null;
    }
}
