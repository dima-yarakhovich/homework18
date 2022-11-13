package Avto;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume, double pitStop, double bestLapTime, double maxSpeed) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
    }
    @Override
    public String info() {
        return getModel()+": Пит-стоп "+getPitStop()+", Лучшее время круга "+getBestLapTime()+", Максимальная скорость "+getMaxSpeed();
    }


    //    public Bus(String brand, String model, int yearMade, String country, String color, int maxSpeed, String refill) {
//        super(brand, model, yearMade, country, color, maxSpeed, refill);
//    }
//
//    public void refil() {
//        System.out.println(getRefill());
//    }
}
