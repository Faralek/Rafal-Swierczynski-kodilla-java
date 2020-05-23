package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (countryName != null ? !countryName.equals(country.countryName) : country.countryName != null) return false;
        return peopleQuantity != null ? peopleQuantity.equals(country.peopleQuantity) : country.peopleQuantity == null;
    }

    @Override
    public int hashCode() {
        int result = countryName != null ? countryName.hashCode() : 0;
        result = 31 * result + (peopleQuantity != null ? peopleQuantity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }

}
