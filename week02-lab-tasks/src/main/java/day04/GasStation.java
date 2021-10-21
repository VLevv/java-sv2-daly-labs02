package day04;

public class GasStation {

    private double price;

    public GasStation(double price) {
        this.price = price;
    }

    public double refill(Car car, double fuel){
        car.setFuel(fuel);
        return fuel*price;
    }

    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation(400);
        car.setFuel(30);
        car.setDistance(3000);
        System.out.println(car.averageFuel());
        System.out.println(gasStation.refill(car,30));
    }
}
