package com.sport.net.dto;

public class UserDto {


    private final String login;
    private final String email;
    private final String gender;
    private final String goal;
    private final String name;
    private final String form;
    private final int height;
    private final int age;
    private final int weight;

    @Override
    public String toString() {
        return "UserDto{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", goal='" + goal + '\'' +
                ", name='" + name + '\'' +
                ", form='" + form + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public UserDto(String login, String email, String gender, String goal, String form, String name, int age, int height, int weight) {
        this.login = login;
        this.email = email;
        this.gender = gender;
        this.goal = goal;
        this.form = form;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getGoal() {
        return goal;
    }

    public String getName() {
        return name;
    }

    public String getForm() {
        return form;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
