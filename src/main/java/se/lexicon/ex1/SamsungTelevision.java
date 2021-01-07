package se.lexicon.ex1;

import java.util.Objects;

public class SamsungTelevision {

    private String id;
    private String brand;
    private boolean power;
    //..more fields


    public SamsungTelevision() {
    }

    public SamsungTelevision(String id, String brand, boolean power) {
        this.id = id;
        this.brand = brand;
        this.power = power;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SamsungTelevision that = (SamsungTelevision) o;
        return power == that.power && Objects.equals(id, that.id) && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, power);
    }

    @Override
    public String toString() {
        return "SamsungTelevision{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                '}';
    }
}
