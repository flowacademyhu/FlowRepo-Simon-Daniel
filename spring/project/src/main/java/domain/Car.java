package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "plate_number")
    private String plateNumber;

    @Column(name = "brand")
    private String brand;

    @Column(name = "type")
    private String type;

    @Column(name = "vintage")
    private String vintage;

    @Column(name = "traffic_test_date")
    private LocalDate trafficTestDate;

    public Car() {
    }

    public Car(String plateNumber, String brand, String type, String vintage, LocalDate trafficTestDate) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.type = type;
        this.vintage = vintage;
        this.trafficTestDate = trafficTestDate;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVintage() {
        return vintage;
    }

    public void setVintage(String vintage) {
        this.vintage = vintage;
    }

    public LocalDate getTrafficTestDate() {
        return trafficTestDate;
    }

    public void setTrafficTestDate(LocalDate trafficTestDate) {
        this.trafficTestDate = trafficTestDate;
    }
}
