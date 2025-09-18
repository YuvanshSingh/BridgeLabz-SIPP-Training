package com.smartcity.transport;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double baseRate, double distanceKm);
}
