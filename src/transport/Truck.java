
package transport;

import java.lang.reflect.Type;

public class Truck extends Transport<DriverC> {
    BodyType bodyType;
    public enum BodyType {
        N1(null, 3.5F),
        N2(3.5F, 12F),
        N3(12F, null);
        private Float minMass;
        private Float maxMass;
        BodyType(Float minMass, Float maxMass) {
            this.minMass = minMass;
            this.maxMass = maxMass;
        }

        @Override
        public String toString() {
            return  (minMass == null ? " "  : " minMass= " + String.valueOf(minMass)) +
                    (minMass == null ? " " : " minMass= " + String.valueOf(minMass)) +
                    (maxMass == null ? " " : " maxMass= " + String.valueOf(maxMass)) +
                    ']';

        }
    }
    public Truck(String brand, String model, double engineCapacity, DriverC driver, BodyType bodyType) {
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
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }
    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");
    }

    @Override
    public Type getType() {
        return Type.class;
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль: " + super.toString();
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовмика");
    }

    @Override
    public void tmeBestCircleTime() {

    }

    @Override
    public void bestTime() {
        double minBound = 2;
        double maxBound = 3.40;
        double bestTime = minBound + (maxBound - minBound) * Math.random();
        System.out.println("Максимальная скорость у грузовика = " + bestTime + " мин.");
    }
    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 160;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у грузовика = " + maxSpeed + " км/ч");
    }

    @Override
    public void printType() {

        System.out.println("Данных по транспортному средству недостаточно");}

    @Override
    public void passDiagnostics() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " проходит диагностику");
    }

}
