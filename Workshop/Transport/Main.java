package com.smartcity.transport;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();

        GeoUtils.Location locA = new GeoUtils.Location(12.9716, 77.5946);
        GeoUtils.Location locB = new GeoUtils.Location(12.9750, 77.5950);
        GeoUtils.Location locC = new GeoUtils.Location(12.9800, 77.6000);

        TransportService bus1 = new BusService("BUS-101", locA, 5.0);
        TransportService metro1 = new MetroService("METRO-1", locB, 3.0);
        TransportService taxi1 = new TaxiService("TAXI-007", locC, 10.0);
        TransportService ferry1 = new FerryService("FERRY-1", locA, 4.5);
        TransportService amb1 = new AmbulanceService("AMB-01", locA, 15.0);

        dashboard.registerService(bus1);
        dashboard.registerService(metro1);
        dashboard.registerService(taxi1);
        dashboard.registerService(ferry1);
        dashboard.registerService(amb1);

        GeoUtils.Location passengerFrom = new GeoUtils.Location(12.9720, 77.5948);
        GeoUtils.Location passengerTo = new GeoUtils.Location(12.9790, 77.5990);

        System.out.println("Available options (sorted by estimated fare):");
        List<TransportService> opts = dashboard.findAvailable(passengerFrom, passengerTo);
        opts.forEach(s -> System.out.printf("%s (%s) estFare=₹%.2f\n",
                s.getId(), s.getType(), s.estimateFare(passengerFrom, passengerTo)));

        TransportService chosen = opts.stream().findFirst().orElse(null);
        if (chosen != null) {
            System.out.println("\nPassenger booked: " + chosen.getId());
            Passenger p = new Passenger("P001", "Anshu");
            double fare = chosen.estimateFare(passengerFrom, passengerTo);
            Trip t = new Trip("A->B", p, fare, LocalDateTime.now());
            dashboard.recordTrip(t);
        }

        System.out.println("\n--- Live Dashboard ---");
        dashboard.displayLiveServices();

        dashboard.recordTrip(new Trip("A->B", new Passenger("P002","Rita"), 30.0, LocalDateTime.now().withHour(8)));
        dashboard.recordTrip(new Trip("A->C", new Passenger("P003","Vikram"), 45.0, LocalDateTime.now().withHour(19)));
        dashboard.recordTrip(new Trip("A->B", new Passenger("P004","Sara"), 25.0, LocalDateTime.now().withHour(14)));

        dashboard.revenueReport();

        System.out.println("\n--- Emergency dispatch demo ---");
        dashboard.findAvailable(passengerFrom, passengerTo).stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> s.startService());

        System.out.printf("\nDistance between passenger and bus1: %.4f units\n",
                GeoUtils.calculateDistance(passengerFrom, locA));

        System.out.println("\nFerry service added and available? " + ferry1.isAvailable(passengerFrom, passengerTo));
    }
}
