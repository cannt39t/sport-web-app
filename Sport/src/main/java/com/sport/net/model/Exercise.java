package com.sport.net.model;

public class Exercise {

    private int id;
    private String name;
    private int time_in_seconds;
    private int count;

    public String getDescryption() {
        return descryption;
    }

    private String descryption;

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time_in_seconds=" + time_in_seconds +
                ", count=" + count +
                '}';
    }

    public Exercise(int id, String name, int time_in_seconds, int count) {
        this.id = id;
        this.name = name;
        this.time_in_seconds = time_in_seconds;
        this.count = count;
        this.descryption = getTime_in_seconds() == 0 ? "" + getCount() : "" + getTime_in_seconds() + " sec";
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}


