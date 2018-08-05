package ru.atom;

public class Bicycle {
    public int cadence;
    public int weight;
    public int speed;

    {
        System.out.println("Before ctor call");
        System.out.println(cadence);
        System.out.println(weight);
        System.out.println(speed);
    }

    public Bicycle(int startCadence, int startWeight, int startSpeed) {
        System.out.println("Ctor is called");
        cadence = startCadence;
        weight = startWeight;
        speed = startSpeed;

        System.out.println(cadence);
        System.out.println(weight);
        System.out.println(speed);
    }

    {
        System.out.println("After ctor call");
        System.out.println(cadence);
        System.out.println(weight);
        System.out.println(speed);
    }

    public void setCadence(int _cadence) {
        cadence = _cadence;
    }

    public void setWeight(int _weight) {
        weight = _weight;
    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public  void speedUp(int increment) {
        speed += increment;
    }
}
