package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightTracker {
    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap();

        flightMap.put("Warsaw", true);
        flightMap.put("Wroclaw", true);
        flightMap.put("Praga", true);
        flightMap.put("Berlin", false);
        flightMap.put("Paris", true);
        flightMap.put("Oklahoma", true);

        if (flightMap.containsKey(flight.getArrivalAirport()) && flightMap.get(flight.getArrivalAirport())) {
            System.out.println("Flight is possible");
        } else {
            System.out.println("We found problem with flight" + flight.toString());
            throw new RouteNotFoundException("There is no Arrival Port");
        }

    }

}
