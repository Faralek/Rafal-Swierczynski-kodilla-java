package com.kodilla.stream.world;


import java.util.HashSet;
import java.util.Set;

public class Continent {
    private final String continentName;
    private final Set<Country> countries = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public Set<Country> getCountries(){
        return new HashSet<Country>(countries);
    }

    public void showCountries() {
        System.out.println(countries);
    }
}
