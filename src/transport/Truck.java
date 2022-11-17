package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{

    public static final String PIT_STOP = "Пора заехать на пит-стоп";
    public static final String BEAST_LAP_TIME = "Лучшее время круга 05:23:14";
    public static final String MAXIMUM_SPEED = "Максимальна скорость за гонку 156 км/ч";

    public Truck(String brand, String model, double engineVol) {
        super(brand, model, engineVol);
    }

    @Override
    public String toString() {
        return "Грузовой гоночный класс. Бренд: " + brand +
                ". Модель: " + model +
                ". Объем двигателя " + engineVol + " л.";
    }

    @Override
    public void startMoving() {
        System.out.println(brand + " начал движение");
        super.startMoving();
    }

    @Override
    public void stopMoving() {
        System.out.println(brand + " закончил движение");
        super.stopMoving();
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + ThreadLocalRandom.current().nextInt(25, 60) + "сек.");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость в заезде: " + ThreadLocalRandom.current().nextInt(150, 400) + " км/ч");
    }

}
