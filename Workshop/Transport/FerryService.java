package com.smartcity.transport;

public class FerryService extends AbstractTransportService {
    public FerryService(String id, GeoUtils.Location loc, double baseRate) {
        super(id, loc, baseRate);
    }
    @Override public String getType() { return "FERRY"; }
}
