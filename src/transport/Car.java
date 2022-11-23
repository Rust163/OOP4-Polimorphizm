package transport;
public class Car extends Transport implements Competing{

    private TypeOfBody typeOfBody;



    public Car(String brand, String model, double engineVol, TypeOfBody typeOfBody) {
        super(brand, model, engineVol);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String toString() {
        return "Легковой гоночный класс. Бренд: " + brand +
                ". Модель: " + model +
                ". Объем двигателя " + engineVol + " л.";
    }


    public void printType() {
        if(typeOfBody == null){
            System.out.println("Не указанно значение типа кузова!");
        } else {
            System.out.println("Тип кузова: " + typeOfBody);
        }
    }

    @Override
    public boolean passDiagnostics() {

        if(false) {
            System.out.println("Нет необходимости проходить диагностику.");
            return true;
        } else {
            System.out.println("Необходимо пройти диагностику!");
            return false;
        }
    }

    @Override
    public void carRepair() {
        System.out.println("Машина " + getBrand()  + " " + getModel() + " полностью отремонтирована и готова к гонке.");
    }


}

