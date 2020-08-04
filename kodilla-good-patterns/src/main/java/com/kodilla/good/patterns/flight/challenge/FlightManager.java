package com.kodilla.good.patterns.flight.challenge;

import java.util.ArrayList;

public class FlightManager {
    public static void main(String[] args) {


        FlightOperationProcessor flightOperationProcessor = new FlightOperationProcessor();
        ArrayList<Flight> flights = new ArrayList<>();

        Flight flight1 = new Flight(1, "warsaw", "wroclaw");
        Flight flight2 = new Flight(2, "warsaw", "wroclaw");
        Flight flight3 = new Flight(3, "krakow", "wroclaw");
        Flight flight4 = new Flight(4, "krakow", "warsaw");
        Flight flight5 = new Flight(5, "warsaw", "krakow");
        Flight flight6 = new Flight(6, "wroclaw", "krakow");

        flight1.addPassAirport("poznan");
        flight2.addPassAirport("poznan");
        flight4.addPassAirport("gdansk");
        flight5.addPassAirport("gdansk");

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);

        flightOperationProcessor.findArrivalAirport("warsaw",flights);
        System.out.println("");
        flightOperationProcessor.findDepartureAirport("wroclaw",flights);
        System.out.println("");
        flightOperationProcessor.findTrack("krakow","warsaw",flights);
        System.out.println("");
        flightOperationProcessor.findPassingFlight("warsaw","wroclaw","poznan",flights);
    }
}
