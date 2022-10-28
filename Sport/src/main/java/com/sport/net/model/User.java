package com.sport.net.model;

public class User {

    private int id;
    private String login ;
    private String email;
    private String password;
    private String key;
    private String salt;
    private String gender;
    private String goal;
    private String form;
    private String name;
    private int age;
    private int height;
    private int weight;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User(int id, String login, String email, String key, String salt, String gender, String goal, String form, String name, int age, int height, int weight) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.key = key;
        this.salt = salt;
        this.gender = gender;
        this.goal = goal;
        this.form = form;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public User(String login, String email, String password) {
        this.login = login;
        this.email = email;
        this.password = password;
    }

    public User(String login, String email, String gender, String goal, String form, String name, int age, int height, int weight) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", key='" + key + '\'' +
                ", salt='" + salt + '\'' +
                ", gender='" + gender + '\'' +
                ", goal='" + goal + '\'' +
                ", form='" + form + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
