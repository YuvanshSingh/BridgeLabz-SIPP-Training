package com.smartcity.transport;

public abstract class AbstractTransportService implements TransportService {
    protected final String id;
    protected final GeoUtils.Location location;
    protected final double baseRatePerKm;

    protected AbstractTransportService(String id, GeoUtils.Location location, double baseRatePerKm) {
        this.id = id; this.location = location; this.baseRatePerKm = baseRatePerKm;
    }

    @Override public String getId() { return id; }

    @Override
    public boolean isAvailable(GeoUtils.Location from, GeoUtils.Location to) {
        double d = GeoUtils.calculateDistance(location, from);
        return d < 10.0;
    }

    @Override
    public double estimateFare(GeoUtils.Location from, GeoUtils.Location to) {
        double distance = GeoUtils.calculateDistance(from, to);
        FareCalculator calc = (base, dist) -> base * dist;
        return calc.calculateFare(baseRatePerKm, distance);
    }

    @Override
    public void printServiceDetails() {
        TransportService.super.printServiceDetails();
        System.out.println("  Loc: " + location + " baseRate/km: " + baseRatePerKm);
    }
}
