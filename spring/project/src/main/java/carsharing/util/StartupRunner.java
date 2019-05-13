package carsharing.util;

import carsharing.domain.Car;
import carsharing.domain.Driver;
import carsharing.domain.Reservation;
import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("AAA-001", "Audi", "A1", 2010, LocalDate.of(2011, 15, 20));
        Car car2 = new Car("BBB-001", "Mercedes", "M1", 2011, LocalDate.of(2012, 18, 21));

        Driver driver1 = new Driver("ferike", "123456", "Nagy Ferenc", LocalDate.of(2008, 1, 1), true);
        Driver driver2 = new Driver("katika", "123456", "Nagy Kata", LocalDate.of(2006, 2, 1), false);

        Reservation reservation1 = new Reservation(LocalDateTime.now(), LocalDate.of(2018, 1, 1), LocalDate.of(2018, 1, 2), LocalDate.of(2019, 2, 2), true, driver1, car1);
        Reservation reservation2 = new Reservation(LocalDateTime.now(), LocalDate.of(2018, 1, 2), LocalDate.of(2018, 2, 3), LocalDate.of(2010, 2, 2), false, driver2, car2);

    }
}
