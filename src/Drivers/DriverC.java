package Drivers;

import transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String name, String lastName, String patronymic, String driverLicense, int experience) {
        super(name, lastName, patronymic, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "Водитель категории С. Имя: " + name +
                ". Фамилия: " + lastName +
                ". Отчество: " + patronymic +
                ". Водительская лицензия. Категория: " + driverLicense +
                ". Опыт вождения: " + experience +
                " лет.";
    }
}
