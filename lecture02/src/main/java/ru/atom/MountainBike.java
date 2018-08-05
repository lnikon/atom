package ru.atom;

public class MountainBike extends Bicycle {
    public int hegiht;

    public MountainBike(int startCadence, int startWeight, int startSpeed, int startHeight) {
        super(startCadence, startWeight, startWeight);
        hegiht = startHeight;
    }

    public void setHegiht(int _height) {
        hegiht = _height;
    }
}
