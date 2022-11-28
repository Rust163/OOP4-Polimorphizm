import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car(
                "Ford",
                "Mustang GT500",
                7.2,
                TypeOfBody.COUPE);
        System.out.println(ford.toString());
        ford.addDriver(new DriverB(
                "Сергей",
                "Васильевич",
                "Торрето",
                "B",
                25,ford));
        ford.addMechanic(new Mechanik<Car>("Андрей Петров", "Bosch"));
        ford.addSponsor(new Sponsor("Gazprom", 2_500_000));

        borderLine2();

        Car dodge = new Car(
                "Dodge",
                "Charger",
                7.2,
                TypeOfBody.COUPE);
        dodge.addDriver(new DriverB(
                "Николай",
                "Петрович",
                "Бензинович",
                "B",
                15, dodge));
        dodge.addMechanic(new Mechanik<Car>("Владислав Жуков", "Interskol"));
        dodge.addSponsor(new Sponsor("Colgate", 5_000_000));
        borderLine2();
        Car plimuth = new Car(
                "Plimuth",
                "Barracuda",
                8.4,
                TypeOfBody.COUPE);

        Car nissan = new Car(
                "Nissan",
                "Skyline R34 GTR",
                3.5,
                TypeOfBody.COUPE);

        Bus man1 = new Bus(
                "MAN",
                "Lion`s   Coach",
                10.2,
                PassengerCapacity.SMALL);
        man1.addDriver(new DriverD(
                "Андрей",
                "Васильевич",
                "Торрето",
                "D",
                14));
        man1.addMechanic(new Mechanik<Bus>("Николай Валуев", "PitStooop"));
        man1.addSponsor(new Sponsor("Castrol", 60_000_000));
        borderLine2();
        Bus man2 = new Bus(
                "MAN",
                "Lion`s Intercity",
                11.2,
                PassengerCapacity.AVERAGE);

        Bus man3 = new Bus(
                "MAN",
                "MAN Lion`s City",
                10.5, PassengerCapacity.AVERAGE);

        Bus man4 = new Bus(
                "MAN",
                "MAN Lion`s City E",
                11.0,
                PassengerCapacity.ESPECIALLY_BIG);
        borderLine();
        Truck kenworth = new Truck(
                "Kenworth",
                "W900L",
                15.0,
                LoadCapacity.N3);
        kenworth.addDriver(new DriverC(
                "Доминик",
                "Васильевич",
                "Торрето",
                "C",
                12));
        kenworth.addMechanic(new Mechanik<Truck>("Захаров Василий", "Авторемонт"));
        kenworth.addSponsor(new Sponsor("Shell", 85_000_000));

        Truck international = new Truck(
                "International",
                "9600",
                15.2,
                LoadCapacity.N3);

        Truck marmon = new Truck(
                "Marmon",
                "CHDT-BC",
                14.5,
                LoadCapacity.N2);

        Truck peterbilt = new Truck(
                "Peterbilt",
                "362",
                14.0,
                LoadCapacity.N1);

        DriverB driverPlimuth = new DriverB(
                "Петр",
                "Сергеевич",
                "Коробкин",
                "B",
                13, plimuth);



        DriverB driverNissan = new DriverB(
                "Василий",
                "Николаевич",
                "Глушакович",
                "B",
                12, nissan);

        DriverD driverMan1 = new DriverD(
                "Андрей",
                "Васильевич",
                "Торрето",
                "D",
                14);

        DriverD driverMan2 = new DriverD(
                "Денис",
                "Петрович",
                "Бензинович",
                "D",
                8);

        DriverD driverMan3 = new DriverD(
                "Степан",
                "Сергеевич",
                "Коробкин",
                "D",
                55);

        DriverD driverMan4 = new DriverD(
                "Алексей",
                "Николаевич",
                "Глушакович",
                "D",
                15);

        DriverC driverKenworth = new DriverC(
                "Доминик",
                "Васильевич",
                "Торрето",
                "C",
                12);

        DriverC driverInternational = new DriverC(
                "Брайан",
                "Петрович",
                "Бензинович",
                "C",
                30);

        DriverC driverMarmon = new DriverC(
                "Слава",
                "Сергеевич",
                "Виндизель",
                "C",
                23);

        DriverC driverPeterbilt = new DriverC(
                "Константин",
                "Николаевич",
                "Литолов",
                "C",
                11);


        Set<String> set = new HashSet<>();
        set.add(String.valueOf(ford));
        List<Transport> transports = List.of(ford, dodge, plimuth, nissan, man1, man2, man3, man4, kenworth, marmon, peterbilt, international);

        TechStation<Transport> station = new TechStation<>("Станция техосмотра");
        station.addQueue(ford);
        station.addQueue(nissan);
        station.addQueue(dodge);
        station.addQueue(international);
        station.addQueue(marmon);
        station.addQueue(kenworth);
        station.addTransport(ford);
        station.passingMaintenance();

        station.repairAuto();

        TechStation.repairAuto();
    }



    public static void borderLine() {
        System.out.println("==============================================================================================================================================================================================");
    }

    public static void borderLine2() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    /*private static void passDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            passDiagnosticsTransport(transport);
        }
    }*/

    /*private static void passDiagnosticsTransport(Transport transport) {
        try {
            if(!transport.passDiagnostics()) {
                throw new RuntimeException("Автомобил " + transport.getBrand() + " " + transport.getModel() + " диагностику не прошел!");
            }

        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }*/






}