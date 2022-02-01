package com.example.poormansgym;

public class Workout {

    private int id;
    private String date;
    private int sets;
    private int reps;
    private int weight;
    private int id2;


    public Workout(int id, String date, int sets, int reps, int weight, int id2) {
        this.id = id;
        this.date = date;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.id2= id2;
    }

    public Workout(int id) {
    //default -- intentionally left empty
    }

    //to string

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", sets=" + sets +
                ", reps=" + reps +
                ", weight=" + weight +
                ", id2=" + id2 +
                '}';
    }


    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int  getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }
}
