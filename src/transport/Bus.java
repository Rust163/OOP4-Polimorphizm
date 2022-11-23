package transport;
public class Bus extends Transport implements Competing{

    private PassengerCapacity passengerCapacity;

    public Bus(String brand, String model, double engineVol, PassengerCapacity passengerCapacity) {
        super(brand, model, engineVol);
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(PassengerCapacity passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Пассажирский гоночный класс. Бренд: " + brand +
                ". Модель: " + model +
                ". Объем двигателя " + engineVol + " л.";
    }

    public void printType() {
        if(passengerCapacity == null){
            System.out.println("Не указанно значение типа кузова!");
        } else {
            System.out.println("Вместимость автобуса минимум: " + passengerCapacity.getFrom() + " чел., максимум: " + passengerCapacity.getBefore());
        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус " + getBrand() + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public void carRepair() {
        System.out.println("Автобус " + getBrand()  + " " + getModel() + " полностью отремонтирован и готов к гонке.");
    }
}
