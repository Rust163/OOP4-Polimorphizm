import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car(
                "Ford",
                "Mustang GT500",
                7.2);
        System.out.println(ford.toString());
        ford.startMoving();
        ford.pitStop();
        ford.bestLapTime();
        ford.maximumSpeed();

        borderLine2();

        Car dodge = new Car(
                "Dodge",
                "Charger",
                7.2);
        System.out.println(dodge.toString());
        dodge.stopMoving();
        borderLine2();
        Car plimuth = new Car(
                "Plimuth",
                "Barracuda",
                8.4);
        System.out.println(plimuth.toString());
        borderLine2();
        Car nissan = new Car(
                "Nissan",
                "Skyline R34 GTR",
                3.5);
        System.out.println(nissan.toString());

        borderLine();
        Bus man1 = new Bus(
                "MAN",
                "Lion`s   Coach",
                10.2);
        System.out.println(man1.toString());
        borderLine2();
        Bus man2 = new Bus(
                "MAN",
                "Lion`s Intercity",
                11.2);
        System.out.println(man2.toString());
        borderLine2();
        Bus man3 = new Bus(
                "MAN",
                "MAN Lion`s City",
                10.5);
        System.out.println(man3.toString());

        borderLine2();
        Bus man4 = new Bus(
                "MAN",
                "MAN Lion`s City E",
                11.0);
        System.out.println(man4.toString());
        borderLine();
        Truck kenworth = new Truck(
                "Kenwort",
                "W900L",
                15.0);
        System.out.println(kenworth.toString());
        borderLine2();
        Truck international = new Truck(
                "International",
                "9600",
                15.2);
        System.out.println(international.toString());
        borderLine2();
        Truck marmon = new Truck(
                "Marmon",
                "CHDT-BC",
                14.5);
        System.out.println(marmon.toString());
        borderLine2();
        Truck peterbilt = new Truck(
                "Peterbilt",
                "362",
                14.0);
        System.out.println(peterbilt.toString());
        peterbilt.maximumSpeed();
        borderLine();
        DriverB driverFord = new DriverB(
                "Сергей",
                "Васильевич",
                "Торрето",
                "B",
                25);
        System.out.println(driverFord.toString());
        driverFord.race();
        driverFord.refill();
        borderLine2();
        DriverB driverDodge = new DriverB(
                "Николай",
                "Петрович",
                "Бензинович",
                "B",
                15);
        System.out.println(driverDodge.toString());
        driverFord.race();
        driverFord.refill();
        borderLine2();
        DriverB driverPlimuth = new DriverB(
                "Петр",
                "Сергеевич",
                "Коробкин",
                "B",
                13);
        System.out.println(driverPlimuth.toString());
        driverFord.race();
        driverFord.refill();
        borderLine2();
        DriverB driverNissan = new DriverB(
                "Василий",
                "Николаевич",
                "Глушакович",
                "B",
                12);
        System.out.println(driverNissan.toString());
        driverFord.race();
        driverFord.refill();
        borderLine();
        DriverD driverMan1 = new DriverD(
                "Андрей",
                "Васильевич",
                "Торрето",
                "D",
                14);
        System.out.println(driverMan1.toString());
        driverFord.race();
        driverFord.refill();
        borderLine2();
        DriverD driverMan2 = new DriverD(
                "Денис",
                "Петрович",
                "Бензинович",
                "D",
                8);
        System.out.println(driverMan2.toString());
        driverFord.race();
        driverFord.refill();
        borderLine2();
        DriverD driverMan3 = new DriverD(
                "Степан",
                "Сергеевич",
                "Коробкин",
                "D",
                61);
        System.out.println(driverMan3.toString());
        driverFord.race();
        driverFord.refill();
        borderLine2();
        DriverD driverMan4 = new DriverD(
                "Алексей",
                "Николаевич",
                "Глушакович",
                "D",
                1);
        System.out.println(driverMan4.toString());
        driverFord.race();
        driverFord.refill();
        borderLine();
        DriverC driverKenwort = new DriverC(
                "Доминик",
                "Васильевич",
                "Торрето",
                "C",
                12);
        System.out.println(driverKenwort.toString());
        driverFord.race();
        driverFord.refill();
        borderLine2();
        DriverC driverInternational = new DriverC(
                "Брайан",
                "Петрович",
                "Бензинович",
                "C",
                30);
        System.out.println(driverInternational.toString());
        driverFord.race();
        driverFord.refill();
        borderLine2();
        DriverC driverMarmon = new DriverC(
                "Слава",
                "Сергеевич",
                "Виндизель",
                "C",
                23);
        System.out.println(driverMarmon.toString());
        driverFord.race();
        driverFord.refill();
        borderLine2();
        DriverC driverPeterbilt = new DriverC(
                "Константин",
                "Николаевич",
                "Литолов",
                "C",
                11);
        System.out.println(driverPeterbilt.toString());
        driverFord.race();
        driverFord.refill();


    }



    public static void borderLine() {
        System.out.println("==============================================================================================================================================================================================");
    }

    public static void borderLine2() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }


}