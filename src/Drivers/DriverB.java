package Drivers;

public class DriverB extends Driver{
    public DriverB(String name, String patronymic, String lastName, String driverLicense, int experience) {
        super(name, patronymic, lastName, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "Водитель категории B. Имя: " + name +
                ". Фамилия: " + lastName +
                ". Отчество: " + patronymic +
                ". Водительская лицензия. Категория: " + driverLicense +
                ". Опыт вождения: " + experience +
                " лет.";
    }
}
