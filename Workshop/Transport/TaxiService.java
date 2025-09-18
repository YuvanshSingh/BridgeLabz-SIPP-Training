package com.smartcity.transport;

public class TaxiService extends AbstractTransportService {
    public TaxiService(String id, GeoUtils.Location loc, double baseRate) {
        super(id, loc, baseRate);
    }
    @Override public String getType() { return "TAXI"; }
}
