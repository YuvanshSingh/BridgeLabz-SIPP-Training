package com.smartcity.transport;

public class AmbulanceService extends AbstractTransportService implements EmergencyService {
    public AmbulanceService(String id, GeoUtils.Location loc, double baseRate) {
        super(id, loc, baseRate);
    }
    @Override public String getType() { return "AMBULANCE"; }

    @Override public void startService() {
        System.out.println(getId() + " (EMERGENCY) dispatch with priority!");
    }
}
