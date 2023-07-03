package org.example;

public class Slytherin extends Studetn {
    private int cunning;
    private int determination;
    private int ambition;

    public Slytherin(String name, int magicPower, int trangressionDistance, int cunning, int determination, int ambition) {
        super(name, magicPower, trangressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public Slytherin(String name, int magicPower, int trangressionDistance) {
        super(name, magicPower, trangressionDistance);
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                '}';
    }}


