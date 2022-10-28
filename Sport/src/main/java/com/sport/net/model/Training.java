package com.sport.net.model;

public class Training {

    private int id;
    private String name;
    private int approaches;
    private String complexity;

    public Training(int id, String name, int approaches, String complexity) {
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

    @Override
    public String toString() {
        return "Training{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", approaches=" + approaches +
                ", complexity='" + complexity + '\'' +
                '}';
    }


}
