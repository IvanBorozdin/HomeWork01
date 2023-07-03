package org.example;

public class Greffendor extends Studetn{
    private int nobility;
    private int honor;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Greffendor(String name, int magicPower, int trangressionDistance,int nobility,int honor,int bravery ){
        super(name,magicPower,trangressionDistance );
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
    }

    @Override
    public String toString() {
        return "Greffendor{" +super.toString()+
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
