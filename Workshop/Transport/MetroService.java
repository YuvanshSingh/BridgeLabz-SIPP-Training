package com.smartcity.transport;

public class MetroService extends AbstractTransportService {
    public MetroService(String id, GeoUtils.Location loc, double baseRate) {
        super(id, loc, baseRate);
    }
    @Override public String getType() { return "METRO"; }
}
