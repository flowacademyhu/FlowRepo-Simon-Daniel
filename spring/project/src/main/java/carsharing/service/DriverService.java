package carsharing.service;

import carsharing.domain.Car;
import carsharing.domain.Driver;
import carsharing.domain.Reservation;
import carsharing.repository.DriverRepository;
import carsharing.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    public Driver save(Driver driver) {
        return driverRepository.save(driver);
    }

    public void delete(String id) throws Exception {
        for (int i = 0; i < reservationRepository.findAll().size(); i++) {
            Reservation chosenResevation = reservationRepository.findAll().get(i);
            if (chosenResevation.getDriver().getFullname() == id) {
                throw new Exception();
            }
            driverRepository.deleteById(id);
        }
    }

    public List<Driver> listDrivers() {
        return driverRepository.findAll();
    }

    public Driver getDriverById(String id) {
        return driverRepository.findById(id).get();
    }


}
