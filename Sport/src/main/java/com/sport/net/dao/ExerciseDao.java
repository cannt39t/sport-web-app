package com.sport.net.dao;

import com.sport.net.model.Exercise;

import java.util.List;

public interface ExerciseDao {

    List<Exercise> getAll();

    public List<Exercise> getByIdTraining(int id);

}
