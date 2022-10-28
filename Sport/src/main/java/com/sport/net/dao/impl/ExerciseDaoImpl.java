package com.sport.net.dao.impl;

import com.sport.net.dao.ExerciseDao;
import com.sport.net.model.Exercise;
import com.sport.net.model.TrainingToExercise;
import com.sport.net.util.PostgresConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExerciseDaoImpl implements ExerciseDao {

    private final Connection connection = PostgresConnectionUtil.getConnection();

    @Override
    public List<Exercise> getAll() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * from exercise;";
            ResultSet resultSet = statement.executeQuery(sql);

            List<Exercise> exercises = new ArrayList<>();

            while (resultSet.next()) {
                Exercise exercise = new Exercise(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("time_in_seconds"),
                        resultSet.getInt("count")
                );
                exercises.add(exercise);
            }

            return exercises;
        } catch (SQLException e) {
            return List.of();
        }
    }

    @Override
    public List<Exercise> getByIdTraining(int id) {
        List<Exercise> res = new ArrayList<>();
        for (TrainingToExercise trainingToExercise : getRelations()) {
            if(trainingToExercise.getId_training() == id){
                res.add(get(trainingToExercise.getId_exercise()));
            }
        }
        return res;
    }


    private List<TrainingToExercise> getRelations(){
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * from training_exercise;";
            ResultSet resultSet = statement.executeQuery(sql);

            List<TrainingToExercise> trainingToExercises = new ArrayList<>();

            while (resultSet.next()) {
                TrainingToExercise trainingToExercise = new TrainingToExercise(
                        resultSet.getInt("id_training"),
                        resultSet.getInt("id_exercise")
                );
                trainingToExercises.add(trainingToExercise);
            }
            return trainingToExercises;
        } catch (SQLException e) {
            return List.of();
        }
    }

    private Exercise get(int id){
        for (Exercise exercise : getAll()) {
            if (exercise.getId() == id){
                return exercise;
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        ExerciseDaoImpl exerciseDao = new ExerciseDaoImpl();
        exerciseDao.getByIdTraining(1).forEach(System.out::println);
    }

}
