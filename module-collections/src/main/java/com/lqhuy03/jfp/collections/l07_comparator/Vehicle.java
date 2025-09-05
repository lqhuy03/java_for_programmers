package com.lqhuy03.jfp.collections.l07_comparator;

import java.util.Objects;

public class Vehicle {
    private final String brand;
    private final Integer makeYear;

    public Vehicle(String brand, Integer makeYear) {
        this.brand = brand;
        this.makeYear = makeYear;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getMakeYear() {
        return makeYear;
    }

    @Override
    public String toString() {
        return "Vehicle{brand='" + brand + "', makeYear=" + makeYear + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(brand, vehicle.brand) &&
            Objects.equals(makeYear, vehicle.makeYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, makeYear);
    }
}

