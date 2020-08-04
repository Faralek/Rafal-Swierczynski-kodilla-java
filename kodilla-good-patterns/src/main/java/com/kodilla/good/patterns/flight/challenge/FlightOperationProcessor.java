package com.kodilla.good.patterns.flight.challenge;

import java.util.ArrayList;

public class FlightOperationProcessor {

    public void findArrivalAirport(String airport,ArrayList<Flight> flights){
        flights.stream()
                .filter(a -> a.arrivalAirport.equals(airport))
                .map(a ->"Na danym lotnisku laduje lot o ID " + a.flightID)
                .forEach(System.out::println);
    }

    public void findDepartureAirport(String airport,ArrayList<Flight> flights){
        flights.stream()
                .filter(a -> a.departureAirport.equals(airport))
                .map(a ->"z danego lotniska wylatuje lot o ID " + a.flightID)
                .forEach(System.out::println);
    }

    public void findTrack(String arrivalAirport, String departureAirport, ArrayList<Flight> flights){
        flights.stream()
                .filter(a -> a.arrivalAirport.equals(arrivalAirport))
                .filter(a -> a.departureAirport.equals(departureAirport))
                .map(a -> "Na danej trasie kursuje lot o ID " + a.flightID)
                .forEach(System.out::println);
    }

    public void findPassingFlight(String arrivalAirport, String departureAirport,String passAirport, ArrayList<Flight> flights){
        flights.stream()
                .filter(a -> a.arrivalAirport.equals(arrivalAirport))
                .filter(a -> a.departureAirport.equals(departureAirport))
                .filter(a -> a.passingAirports.contains(passAirport))
                .map(a -> "Na danej trasie kursuje lot o ID " + a.flightID)
                .forEach(System.out::println);
    }

}
