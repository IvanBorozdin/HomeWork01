package org.example;

public class Main {
    public static void main(String[] args) {
        Greffendor[] students = {
          new Greffendor("Harry Potter",90, 90, 90,90,90 ),
          new Greffendor("Hermiona Granger",80,95,90,90,90)
        };
        hogwartsStudent printer = new  hogwartsStudent();
        for (Studetn studetn:students){
            printer.print(studetn);
        }
        Hogwarts hogwarts = new Hogwarts();
        hogwarts.compareGreffendor(students[0],students [1]);
    }
}