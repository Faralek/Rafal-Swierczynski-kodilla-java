package com.kodilla.exception.test;

public class FlightTrackingRunner {
    public static void main(String[] args) {

        Flight firstFlight = new Flight("Wroclaw", "Warsaw");
        Flight secondFlight = new Flight("Praga", "Berlin");
        Flight thirdFlight = new Flight("Paris", "Oklahoma");
        Flight fourthFlight = new Flight("Warsaw", "London");

        FlightTracker flightTracker = new FlightTracker();
        try {
            flightTracker.findFlight(firstFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Arrival port does not exist on map");
        }
        try {
            flightTracker.findFlight(secondFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Arrival port does not exist on map");
        }
        try {
            flightTracker.findFlight(thirdFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Arrival port does not exist on map");
        }
        try {
            flightTracker.findFlight(fourthFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Arrival port does not exist on map");
        }
    }
}
