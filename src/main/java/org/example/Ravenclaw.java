package org.example;

public class Ravenclaw extends Studetn {
    private int smart;
    private int wise;
    private int witty;

    public Ravenclaw(String name, int magicPower, int trangressionDistance, int smart, int wise, int witty) {
        super(name, magicPower, trangressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public Ravenclaw(String name, int magicPower, int trangressionDistance) {
        super(name, magicPower, trangressionDistance);
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                '}';
    }
}
