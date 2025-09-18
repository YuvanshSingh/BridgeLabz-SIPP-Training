package com.smartcity.transport;

import java.time.LocalDateTime;

public class Trip {
    private final String route;
    private final Passenger passenger;
    private final double fare;
    private final LocalDateTime time;
    public Trip(String route, Passenger passenger, double fare, LocalDateTime time) {
        this.route = route; this.passenger = passenger; this.fare = fare; this.time = time;
    }
    public String getRoute() { return route; }
    public Passenger getPassenger() { return passenger; }
    public double getFare() { return fare; }
    public LocalDateTime getTime() { return time; }
    @Override public String toString() {
        return String.format("Trip[%s, %s, ₹%.2f, %s]", route, passenger, fare, time);
    }
}
