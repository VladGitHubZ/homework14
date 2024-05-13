//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Bicycle 1");
        Car car = new Car("Car 1", 4);
        Truck truck = new Truck("Truck 1", 6);
        ServiceStation serviceStation = new ServiceStation();

        System.out.println("Bicycle diagnostic");
        serviceStation.check(bicycle);
        System.out.println("------------------");

        System.out.println("Car diagnostic");
        serviceStation.check(car);
        System.out.println("------------------");

        System.out.println("Truck diagnostic");
        serviceStation.check(truck);
        System.out.println("------------------");


    }
}