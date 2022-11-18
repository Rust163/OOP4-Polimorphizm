package Drivers;

import transport.Car;
import transport.Transport;

public class Driver<T extends Transport> {
    protected static String name;
    protected String lastName;
    protected String patronymic;
    protected String driverLicense;
    protected int experience;
    public T car;

    public Driver (T car) {
        this.car = car;
    }

    public Driver(String name, String patronymic, String lastName, String driverLicense, int experience) {
        if(name == null || name.isEmpty() || name.isBlank()){
            name = "Не указано!";
        } this.name = name;

        if(patronymic == null || patronymic.isEmpty() || patronymic.isBlank()){
            patronymic = "Не указано!";
        } this.patronymic = patronymic;

        if(lastName == null || lastName.isEmpty() || lastName.isBlank()){
            lastName = "Не указано!";
        } this.lastName = lastName;

        if(driverLicense == null || driverLicense.isEmpty() || driverLicense.isBlank()){
            driverLicense = "Лицензия отсутствует!";
        } this.driverLicense = driverLicense;

        if(experience <= 3 || experience >= 60) {
            System.out.println("К сожалению вы не годитесь в гонщики!");
        } this.experience = experience;
        this.car = car;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public void startDriving() {
        System.out.printf("Водитель " + getName() + " стартовал");
        this.car.startMoving();
    }

    public void finishDriving() {
        System.out.printf("Водитель " + getName() + " финишировал");
        this.car.stopMoving();
    }

    public void refill() {
        System.out.println("Водитель "+ getName() + " заправляет " + car.getBrand() + car.getModel());
    }


    public void race() {
        System.out.println("Водитель " + getName() + " управляет автомобилем " + car.getBrand() + car.getModel());
    }
}

