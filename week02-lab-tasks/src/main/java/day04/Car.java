package day04;

public class Car {
    private double fuel;
    private double distance;

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double averageFuel(){
        return distance/fuel;
    }
}
