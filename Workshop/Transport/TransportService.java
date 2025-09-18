package com.smartcity.transport;

public interface TransportService {
    String getId();
    String getType();
    boolean isAvailable(GeoUtils.Location from, GeoUtils.Location to);
    double estimateFare(GeoUtils.Location from, GeoUtils.Location to);

    default void printServiceDetails() {
        System.out.println("Service: " + getId() + " [" + getType() + "]");
    }

    default void startService() {
        System.out.println(getId() + " started.");
    }
}
