package transport;

import java.lang.reflect.Type;

public class Car extends Transport<DriverB> {
    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбэк"),
        COUPE("Купе"),
        ESTATE("Уневерсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивен");
        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return ", тип кузова: " + bodyType +
                    " ";
        }
    }

    BodyType bodyType;

    public Car(String brand, String model, double engineCapacity, DriverB driver, BodyType bodyType) {
        super(brand, model, engineCapacity, driver);
        this.bodyType = bodyType;
    }

    @Override
    public void startMove() {
        System.out.println("Легковой автомобиль марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Легковой автомобиль марки " + getBrand() + " закончил");
    }

    @Override
    public Type getType() {
        return Type.class;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " + super.toString() + " " + bodyType;
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void tmeBestCircleTime() {

    }

    @Override
    public void bestTime() {
        double minBound = 1.2;
        double maxBound = 2.1;
        double bestTime = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость у грузовика = " + bestTime + " мин.");
    }

    @Override
    public void maxSpeed() {
        double minBound = 100;
        double maxBound = 200;
        double maxSpeed = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость у автомобиля = " + maxSpeed + " км/ч");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (getType() != null) {
            System.out.println(getType());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " проходит диагностику");
    }
}
