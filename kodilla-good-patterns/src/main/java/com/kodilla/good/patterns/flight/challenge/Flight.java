package com.kodilla.good.patterns.flight.challenge;

import java.util.ArrayList;


public class Flight {

    public final int flightID;
    public final String arrivalAirport;
    public final String departureAirport;
    public ArrayList<String> passingAirports = new ArrayList<>();


    public Flight(int flightID, String arrivalAirport, String departureAirport) {
        this.flightID = flightID;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }

    public void addPassAirport(String airport) {
        passingAirports.add(airport);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight Flight = (Flight) o;

        if (flightID != Flight.flightID) return false;
        if (arrivalAirport != null ? !arrivalAirport.equals(Flight.arrivalAirport) : Flight.arrivalAirport != null)
            return false;
        if (departureAirport != null ? !departureAirport.equals(Flight.departureAirport) : Flight.departureAirport != null)
            return false;
        return passingAirports != null ? passingAirports.equals(Flight.passingAirports) : Flight.passingAirports == null;
    }

    @Override
    public int hashCode() {
        int result = flightID;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        result = 31 * result + (passingAirports != null ? passingAirports.hashCode() : 0);
        return result;
    }

}
