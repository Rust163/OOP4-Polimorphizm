package transport;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Transport {
    protected static String brand;
    protected static String model;
    protected double engineVol;

    public Transport(String brand, String model, double engineVol) {
        this.brand = brand;
        this.model = model;
        this.engineVol = engineVol;
    }

    public static String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVol() {
        return engineVol;
    }

    public void setEngineVol(double engineVol) {
        this.engineVol = engineVol;
    }

    public void startMoving() {
        System.out.println(brand + " начал движение");

    }


    public void stopMoving() {
        System.out.println(brand + " закончил движение");

    }


    public void pitStop() {
        System.out.printf("Автомобиль %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }


    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + ThreadLocalRandom.current().nextInt(25, 60) + "сек.");
    }


    public void maximumSpeed() {
        System.out.println("Максимальная скорость в заезде: " + ThreadLocalRandom.current().nextInt(150, 400) + " км/ч");
    }
}
