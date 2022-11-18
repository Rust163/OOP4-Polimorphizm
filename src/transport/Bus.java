package transport;
public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, double engineVol) {
        super(brand, model, engineVol);
    }

    @Override
    public String toString() {
        return "Пассажирский гоночный класс. Бренд: " + brand +
                ". Модель: " + model +
                ". Объем двигателя " + engineVol + " л.";
    }
}
