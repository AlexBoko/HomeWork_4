import transport.*;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {

        DriverB driverB1 = new DriverB("Водитель 1", true, 12);
        DriverB driverB2 = new DriverB("Водитель 2", true, 11);
        DriverB driverB3 = new DriverB("Водитель 3", true, 14);
        DriverB driverB4 = new DriverB("Водитель 4", true, 18);
        DriverC driverC1 = new DriverC("Водитель 5", true, 13);
        DriverC driverC2 = new DriverC("Водитель 6", true, 20);
        DriverC driverC3 = new DriverC("Водитель 7", true, 22);
        DriverC driverC4 = new DriverC("Водитель 8", true, 19);
        DriverD driverD1 = new DriverD("Водитель 9", true, 10);
        DriverD driverD2 = new DriverD("Водитель 10", true, 11);
        DriverD driverD3 = new DriverD("Водитель 11", true, 18);
        DriverD driverD4 = new DriverD("Водитель 12", true, 11);

        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", "R8", 3.0, driverB1, Car.BodyType.SEDAN);
        cars[1] = new Car("BMW", "Z8", 3.2, driverB2, Car.BodyType.HATCHBACK);
        cars[2] = new Car("Kia", "Sportage 4-го поколения", 2.3, driverB3, Car.BodyType.COUPE);
        cars[3] = new Car("Hyundai", "Avante", 1.8, driverB4, Car.BodyType.SEDAN);
        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Volvo", "городской", 3.2, driverD1, Bus.BodyType.LARGE);
        buses[1] = new Bus("BMW", "120", 4.6, driverD2, Bus.BodyType.VERY_SMALL);
        buses[2] = new Bus("Volvo", "9900", 5.5, driverD3, Bus.BodyType.SMALL);
        buses[3] = new Bus("Volvo", "9700", 5.8, driverD4, Bus.BodyType.VERY_LARGE);
        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Volvo", "North", 11.8, driverC1, Truck.BodyType.N2);
        trucks[1] = new Truck("Mercedes", "Europe", 13.2, driverC2, Truck.BodyType.N2);
        trucks[2] = new Truck("Volvo", "9700", 14.2, driverC3, Truck.BodyType.N3);
        trucks[3] = new Truck("Volvo", "9900", 15.3, driverC4, Truck.BodyType.N1);


        trucks[1].maxSpeed();
        buses[2].bestTime();
        printMass(cars);
        printMass(buses);
        printMass(trucks);
        trucks[3].pitStop();
        trucks[3].setBodyType(Truck.BodyType.N2);
        checkTransportDiagnostic(trucks[1]);
        checkTransportDiagnostic(cars[1]);
        checkTransportDiagnostic(buses[1]);
        checkTransportDiagnostic(buses[3]);
        checkTransportDiagnostic(cars[1]);
        checkTransportDiagnostic(trucks[3]);
        checkTransportDiagnostic(cars[2]);
    }

    public static void printMass(Transport<?>[] transports) {
        for (Transport<?> transport : transports) {
            System.out.println("водитель: " + transport.getDriver().getName() + " "
                    + transport.getDriver().getClass() + ", управляет автомобилем: "
                    + transport.getBrand() + " "
                    + transport.getModel() + " вид транспорта: "
                    + transport.getType() +
                    " и будет участвовать в заезде");
        }
    }

    public static void checkTransportDiagnostic(Transport<?> transports) {

        if (transports.getType().equals(transports.BUS)) {
            try {
                transports.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println("Автобусам не нужно проходить диагностику");
            }
        } else {
            try {
                transports.passDiagnostics();
            } catch (TransportTypeException e) {
                System.out.println(" ");
            }
        }
    }
}