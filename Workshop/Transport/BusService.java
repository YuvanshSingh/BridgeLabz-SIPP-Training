package com.smartcity.transport;

public class BusService extends AbstractTransportService {
    public BusService(String id, GeoUtils.Location loc, double baseRate) {
        super(id, loc, baseRate);
    }
    @Override public String getType() { return "BUS"; }
}
