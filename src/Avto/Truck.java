package Avto;

public class Truck extends  Transport implements  Competing {

    public Truck(String brand, String model, double engineVolume, double pitStop, double bestLapTime, double maxSpeed) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
    }

    @Override
    public String info() {
        return getModel()+": Пит-стоп "+getPitStop()+", Лучшее время круга "+getBestLapTime()+", Максимальная скорость "+getMaxSpeed();
    }

    @Override
    public String info1() {
        return null;
    }
}
