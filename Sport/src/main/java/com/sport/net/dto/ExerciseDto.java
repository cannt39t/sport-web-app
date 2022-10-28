package com.sport.net.dto;

public class ExerciseDto {

    private int id;
    private String name;
    private int time_in_seconds;
    private int count;

    public ExerciseDto(int id, String name, int time_in_seconds, int count) {
        this.id = id;
        this.name = name;
        this.time_in_seconds = time_in_seconds;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime_in_seconds() {
        return time_in_seconds;
    }

    public void setTime_in_seconds(int time_in_seconds) {
        this.time_in_seconds = time_in_seconds;
    }

    @Override
    public String toString() {
        return "ExerciseDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time_in_seconds=" + time_in_seconds +
                ", count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
