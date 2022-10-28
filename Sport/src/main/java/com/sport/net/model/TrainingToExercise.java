package com.sport.net.model;

public class TrainingToExercise {

    private int id_training;
    private int id_exercise;

    public TrainingToExercise(int id_training, int id_exercise) {
        this.id_training = id_training;
        this.id_exercise = id_exercise;
    }

    @Override
    public String toString() {
        return "TrainingToExercise{" +
                "id_training=" + id_training +
                ", id_exercise=" + id_exercise +
                '}';
    }

    public int getId_training() {
        return id_training;
    }

    public void setId_training(int id_training) {
        this.id_training = id_training;
    }

    public int getId_exercise() {
        return id_exercise;
    }

    public void setId_exercise(int id_exercise) {
        this.id_exercise = id_exercise;
    }
}
