package transport;
public class Truck extends Transport implements Competing{

    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVol, LoadCapacity loadCapacity) {
        super(brand, model, engineVol);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовой гоночный класс. Бренд: " + brand +
                ". Модель: " + model +
                ". Объем двигателя " + engineVol + " л.";
    }

    public void printType() {
        if(loadCapacity == null){
            System.out.println("Не указанно значение грузоподъемности!");
        } else {
            String from = loadCapacity.getFrom() == null ? "" : "от" + loadCapacity.getFrom();
            String before = loadCapacity.getBefore() == null ? "" : "до" + loadCapacity.getBefore();
            System.out.println("Тип грузоподъемности: " + from + before);
        }
    }
}
