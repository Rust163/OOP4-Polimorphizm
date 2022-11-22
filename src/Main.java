import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import transport.*;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car(
                "Ford",
                "Mustang GT500",
                7.2,
                TypeOfBody.COUPE);
        System.out.println(ford.toString());
        ford.startMoving();
        ford.pitStop();
        ford.bestLapTime();
        ford.maximumSpeed();

        borderLine2();

        Car dodge = new Car(
                "Dodge",
                "Charger",
                7.2,
                TypeOfBody.COUPE);
        System.out.println(dodge.toString());
        dodge.stopMoving();
        borderLine2();
        Car plimuth = new Car(
                "Plimuth",
                "Barracuda",
                8.4,
                TypeOfBody.COUPE);
        System.out.println(plimuth.toString());
        plimuth.passDiagnostics();
        borderLine2();
        Car nissan = new Car(
                "Nissan",
                "Skyline R34 GTR",
                3.5,
                TypeOfBody.COUPE);
        System.out.println(nissan.toString());

        borderLine();
        Bus man1 = new Bus(
                "MAN",
                "Lion`s   Coach",
                10.2,
                PassengerCapacity.SMALL);
        System.out.println(man1.toString());
        borderLine2();
        Bus man2 = new Bus(
                "MAN",
                "Lion`s Intercity",
                11.2,
                PassengerCapacity.AVERAGE);
        System.out.println(man2.toString());
        borderLine2();
        Bus man3 = new Bus(
                "MAN",
                "MAN Lion`s City",
                10.5, PassengerCapacity.AVERAGE);
        System.out.println(man3.toString());
        man3.printType();

        borderLine2();
        Bus man4 = new Bus(
                "MAN",
                "MAN Lion`s City E",
                11.0,
                PassengerCapacity.ESPECIALLY_BIG);
        System.out.println(man4.toString());
        borderLine();
        Truck kenworth = new Truck(
                "Kenworth",
                "W900L",
                15.0,
                LoadCapacity.N3);
        System.out.println(kenworth.toString());
        borderLine2();
        Truck international = new Truck(
                "International",
                "9600",
                15.2,
                LoadCapacity.N3);
        System.out.println(international.toString());
        borderLine2();
        Truck marmon = new Truck(
                "Marmon",
                "CHDT-BC",
                14.5,
                LoadCapacity.N2);
        marmon.passDiagnostics();
        System.out.println(marmon.toString());
        borderLine2();
        Truck peterbilt = new Truck(
                "Peterbilt",
                "362",
                14.0,
                LoadCapacity.N1);
        System.out.println(peterbilt.toString());


        peterbilt.maximumSpeed();
        borderLine();
        DriverB driverFord = new DriverB(
                "Сергей",
                "Васильевич",
                "Торрето",
                "B",
                25,ford);
        System.out.println(driverFord.toString());
        driverFord.race(ford);
        borderLine2();
        DriverB driverDodge = new DriverB(
                "Николай",
                "Петрович",
                "Бензинович",
                "B",
                15, dodge);
        System.out.println(driverDodge.toString());

        borderLine2();
        DriverB driverPlimuth = new DriverB(
                "Петр",
                "Сергеевич",
                "Коробкин",
                "B",
                13, plimuth);
        System.out.println(driverPlimuth.toString());


        borderLine2();
        DriverB driverNissan = new DriverB(
                "Василий",
                "Николаевич",
                "Глушакович",
                "B",
                12, nissan);
        System.out.println(driverNissan.toString());
        driverNissan.race(nissan);

        borderLine();
        DriverD driverMan1 = new DriverD(
                "Андрей",
                "Васильевич",
                "Торрето",
                "D",
                14);
        System.out.println(driverMan1.toString());

        borderLine2();
        DriverD driverMan2 = new DriverD(
                "Денис",
                "Петрович",
                "Бензинович",
                "D",
                8);
        System.out.println(driverMan2.toString());

        borderLine2();
        DriverD driverMan3 = new DriverD(
                "Степан",
                "Сергеевич",
                "Коробкин",
                "D",
                55);
        System.out.println(driverMan3.toString());

        borderLine2();
        DriverD driverMan4 = new DriverD(
                "Алексей",
                "Николаевич",
                "Глушакович",
                "D",
                1);
        System.out.println(driverMan4.toString());

        borderLine();
        DriverC driverKenworth = new DriverC(
                "Доминик",
                "Васильевич",
                "Торрето",
                "C",
                12);
        System.out.println(driverKenworth.toString());

        borderLine2();
        DriverC driverInternational = new DriverC(
                "Брайан",
                "Петрович",
                "Бензинович",
                "C",
                30);
        System.out.println(driverInternational.toString());


        borderLine2();
        DriverC driverMarmon = new DriverC(
                "Слава",
                "Сергеевич",
                "Виндизель",
                "C",
                23);
        System.out.println(driverMarmon.toString());

        borderLine2();
        DriverC driverPeterbilt = new DriverC(
                "Константин",
                "Николаевич",
                "Литолов",
                "C",
                11);
        System.out.println(driverPeterbilt.toString());
       driverPeterbilt.startDriving();
       driverPeterbilt.refill();

        passDiagnostics(ford, dodge, plimuth, nissan, man1, man2, man3, man4, kenworth, international, marmon, peterbilt);
    }



    public static void borderLine() {
        System.out.println("==============================================================================================================================================================================================");
    }

    public static void borderLine2() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }



    private static void passDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            passDiagnosticsTransport(transport);
        }
    }

    private static void passDiagnosticsTransport(Transport transport) {
        try {
            if(!transport.passDiagnostics()) {
                throw new RuntimeException("Автомобил " + transport.getBrand() + " " + transport.getModel() + " диагностику не прошел!");
            }

        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}