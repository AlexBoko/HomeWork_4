package transport;

import java.lang.reflect.Type;

public class Bus extends Transport<DriverD> {
    BodyType bodyType;
    public enum BodyType {
        VERY_SMALL(null, 10),
        SMALL(10, 25),
        AVERAGE(25, 50),
        LARGE(50, 80),
        VERY_LARGE(80, 120);
        Integer lowerBound;
        Integer upperBound;


        BodyType(Integer lowerBound, Integer upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
        @Override
        public String toString() {
            return (lowerBound == null ? " " : " вместимость от = " + String.valueOf(lowerBound)) +
                    (upperBound == null ? " " : " до = " + String.valueOf(upperBound));
        }
    }
    public Bus(String brand, String model, double engineCapacity, DriverD driver, BodyType bodyType) {
        super(brand, model, engineCapacity, driver);
        this.bodyType = bodyType;
    }
    public BodyType getBodyType() {
        return bodyType;
    }
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }
    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }
    @Override
    public Type getType() {
        return Type.class;
    }
    @Override
    public void printType() {
        if (getType() == null) {
            System.out.println(getType());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException();
    }

    @Override
    public String toString() {
        return "Автобус: " + super.toString();
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void tmeBestCircleTime() {

    }

    @Override
    public void bestTime() {
        double minBound = 1.6;
        double maxBound = 3.40;
        double bestTime = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость у грузовика = " + bestTime + " мин.");
    }
    @Override
    public void maxSpeed() {
        double minBound = 60;
        double maxBound = 150;
        double maxSpeed = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость у автобуса = " + maxSpeed + " км/ч");
    }
}
