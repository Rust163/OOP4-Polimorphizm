package transport;
public class Car extends Transport{

    public Car(String brand, String model, double engineVol) {
        super(brand, model, engineVol);
    }

    @Override
    public String toString() {
        return "Легковой гоночный класс. Бренд: " + brand +
                ". Модель: " + model +
                ". Объем двигателя " + engineVol + " л.";
    }
}
