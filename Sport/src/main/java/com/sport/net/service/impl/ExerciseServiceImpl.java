package com.sport.net.service.impl;

import com.sport.net.dao.impl.ExerciseDaoImpl;
import com.sport.net.model.Exercise;
import com.sport.net.service.ExerciseService;

import java.util.List;

public class ExerciseServiceImpl implements ExerciseService {

    ExerciseDaoImpl exerciseDao = new ExerciseDaoImpl();

    @Override
    public List<Exercise> getExericsesByIdTraining(int id){
        return exerciseDao.getByIdTraining(id);
    }

    public static void main(String[] args) {
        ExerciseDaoImpl exerciseDao = new ExerciseDaoImpl();
        exerciseDao.getByIdTraining(1).forEach( (e) -> System.out.println(e.getDescryption()) );
    }

}
