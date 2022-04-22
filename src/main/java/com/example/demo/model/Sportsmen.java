package com.example.demo.model;

public class Sportsmen {
    String name;
    int age;
    String gameType;
    String nation;

    public Sportsmen(String name, int age, String gameType, String nation) {
        this.name = name;
        this.age = age;
        this.gameType = gameType;
        this.nation = nation;
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

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
