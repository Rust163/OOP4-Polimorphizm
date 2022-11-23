package transport;

import Drivers.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected double engineVol;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanik<?>> mechaniks = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engineVol) {


        this.brand = brand;
        this.model = model;
        this.engineVol = engineVol;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
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

    public abstract void printType();

    public abstract boolean passDiagnostics();

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
        System.out.println(driver + " управляетм автомобилем " + getBrand() + " " + getModel());
    }

    public void  addMechanic(Mechanik<?> mechanik) {
        mechaniks.add(mechanik);
        System.out.println("Механик обслуживающий машину " + mechanik.fullName + " из компании " + mechanik.company);
    }

    public void  addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
        System.out.println("Спонсор " + sponsor.sponsorName + " проспонсировал гонку в размере " + sponsor.amountOfSupport + " руб.");
    }

    public abstract void carRepair();

}