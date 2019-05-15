package carsharing.repository;

import carsharing.domain.Car;
import carsharing.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    public void deleteById(Long id);

//    @Query("FROM TodoItem todoItem WHERE todoItem.user.login = ?1")
//    public List<Car> findByUserLogint(@Param("login") String login);
}
