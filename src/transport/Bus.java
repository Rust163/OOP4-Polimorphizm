package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, double engineVol) {
        super(brand, model, engineVol);
    }

    @Override
    public String toString() {
        return "Пассажирский гоночный класс. Бренд: " + brand +
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


}
