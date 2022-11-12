package Avto;

public class Driver<F extends Transport & Competing > {

    private String FIO;
    private String catLicense;
    private double experience;
    private  F avto;




    protected Driver(String FIO, String catLicense, double experience) {
        this.FIO = FIO;
        this.catLicense = catLicense;
        this.experience = experience;
        this.avto = avto;
    }




    public String getFIO() {
        return FIO;
    }

    public String getCatLicense() {
        return catLicense;
    }

    public double getExperience() {
        return experience;
    }


    public  void startMoving() {
        System.out.println("Начать движение");
    }

    public void pauseMoving() {
        System.out.println("Остановиться");
    }

    public void refillAuto() {
        System.out.println("Заправиться");
    }



    @Override
    public String toString() {
        return "Водитель: ФИО= " + getFIO() + ",управляет автомобилем(марка/модель)= " + avto.getBrand() +"/"+avto.getModel()+" и будет участвовать в заезде";
    }


}



