package carsharing.service;

import carsharing.domain.Driver;
import carsharing.domain.Reservation;
import carsharing.repository.CarRepository;
import carsharing.repository.DriverRepository;
import carsharing.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private DriverRepository driverRepository;

    public Reservation save(Reservation reservation) throws Exception {
        for (int i = 0; i < reservationRepository.findAll().size(); i++) {
            Reservation chosenReservation = reservationRepository.findAll().get(i);
            if (chosenReservation.getCar() == reservation.getCar() && (reservation.isValidLisence() == false ||
                    chosenReservation.getRentStartTime().isAfter(reservation.getRentStartTime()) &&
                            chosenReservation.getRentEndTime().isBefore(reservation.getRentEndTime()) ||
                    reservation.getLisenceEndDate().isBefore(reservation.getRentEndTime()))) {
                throw new Exception();
            }
        }
        return reservationRepository.save(reservation);
    }

    public void delete(Long id) {
        reservationRepository.deleteById(id);
    }

    public List<Reservation> listReservation() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).get();
    }


}
