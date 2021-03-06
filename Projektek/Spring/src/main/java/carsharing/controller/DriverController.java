package carsharing.controller;

import carsharing.domain.Driver;
import carsharing.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/add")
    public ResponseEntity<Driver> addDriver(@RequestBody Driver driver) {
        return ResponseEntity.ok(driverService.save(driver));
    }

    @PutMapping("/update")
    public ResponseEntity<Driver> updateDriver(@RequestBody Driver driver) {
        return ResponseEntity.ok(driverService.save(driver));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDriver(@PathVariable String id) {
        driverService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/list-cars")
    public ResponseEntity<List<Driver>> listDrivers() {
        return ResponseEntity.ok(driverService.listDrivers());
    }

}
