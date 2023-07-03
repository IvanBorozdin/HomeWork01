package org.example;

public class Huffiepuff extends Studetn{
    private int hardwork;
    private int loyalty;
    private int integrity;

    @Override
    public String toString() {
        return "Huffiepuff{" +super.toString()+
                " hardwork=" + hardwork +
                ", loyalty=" + loyalty +
                ", integrity=" + integrity +
                '}';
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public Huffiepuff(String name, int magicPower, int trangressionDistance, int hardwork, int loyalty, int integrity) {
        super(name, magicPower, trangressionDistance);
        this.hardwork = hardwork;
        this.integrity = integrity;
        this.loyalty = loyalty;
    }
}
