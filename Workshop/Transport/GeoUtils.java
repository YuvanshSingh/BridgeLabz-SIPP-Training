package com.smartcity.transport;

public interface GeoUtils {
    static double calculateDistance(Location a, Location b) {
        double dx = a.lat - b.lat;
        double dy = a.lon - b.lon;
        return Math.sqrt(dx*dx + dy*dy);
    }

    class Location {
        public final double lat;
        public final double lon;
        public Location(double lat, double lon) { this.lat = lat; this.lon = lon; }
        @Override public String toString() { return String.format("(%.4f, %.4f)", lat, lon); }
    }
}
