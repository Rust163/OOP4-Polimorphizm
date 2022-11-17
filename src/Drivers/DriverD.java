package Drivers;

public class DriverD extends Driver{
    public DriverD(String name, String lastName, String patronymic, String driverLicense, int experience) {
        super(name, lastName, patronymic, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "Водитель категории D. Имя: " + name +
                ". Фамилия: " + lastName +
                ". Отчество: " + patronymic +
                "Водительская лицензия. Категория: " + driverLicense +
                ". Опыт вождения: " + experience +
                " лет.";
    }
}
