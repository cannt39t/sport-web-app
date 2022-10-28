package com.sport.net.dto;

public class TrainingDto {

    private int id;
    private String name;
    private int approaches;
    private String complexity;

    public TrainingDto(int id, String name, int approaches, String complexity) {
        this.id = id;
        this.name = name;
        this.approaches = approaches;
        this.complexity = complexity;
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

    public int getApproaches() {
        return approaches;
    }

    public void setApproaches(int approaches) {
        this.approaches = approaches;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }
}
