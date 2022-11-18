package transport;
public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVol) {
        super(brand, model, engineVol);
    }
    @Override
    public String toString() {
        return "Грузовой гоночный класс. Бренд: " + brand +
                ". Модель: " + model +
                ". Объем двигателя " + engineVol + " л.";
    }
}
