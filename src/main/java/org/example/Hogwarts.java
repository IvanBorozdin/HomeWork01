package org.example;

public class Hogwarts {
    public void compareGreffendor(Greffendor first,Greffendor second){
        var firstPoint= first.getBravery()+first.getHonor()+first.getNobility();
        var secondPoints = second.getBravery()+second.getHonor()+second.getNobility();
        if (firstPoint>secondPoints){
            System.out.println("Студент "+ first.getName() + " лучше чем "+ second.getName());
        }else if (firstPoint<secondPoints){
            System.out.println("Студент "+ second.getName() + " лучше чем "+ first.getName());
        }else {
            System.out.println("Студент "+ first.getName() + " и "+ second.getName()+ " равны");
        }

    }
    public void compareAnyStudent(Studetn first,Studetn second){
        var firstPoint= first.getMagicPower()+first.getTrangressionDistance();
        var secondPoints = second.getMagicPower()+second.getTrangressionDistance();
        if (firstPoint>secondPoints){
            System.out.println("Студент "+ first.getName() + " лучше чем "+ second.getName());
        }else if (firstPoint<secondPoints){
            System.out.println("Студент "+ second.getName() + " лучше чем "+ first.getName());
        }else {
            System.out.println("Студент "+ first.getName() + " и "+ second.getName()+ " равны");
    }
    }
}
