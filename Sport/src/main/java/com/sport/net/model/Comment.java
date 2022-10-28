package com.sport.net.model;

public class Comment {

    private int id;
    private String value;
    private int author_id;
    private int training_id;

    public Comment(int id, String value, int author_id, int training_id) {
        this.id = id;
        this.value = value;
        this.author_id = author_id;
        this.training_id = training_id;
    }

    public Comment(String value, int author_id, int training_id) {
        this.value = value;
        this.author_id = author_id;
        this.training_id = training_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getTraining_id() {
        return training_id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", author_id=" + author_id +
                ", training_id=" + training_id +
                '}';
    }

    public void setTraining_id(int training_id) {
        this.training_id = training_id;
    }
}
