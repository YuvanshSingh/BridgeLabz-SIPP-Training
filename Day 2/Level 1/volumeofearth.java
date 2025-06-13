public class volumeofearth {

	public static void main(String[] args) {
		
		double pi = 3.14;
		double radiusKm = 6378;

        double kmToMiles = 0.621371;

        double volumeKm3 = (4.0 / 3.0) * pi * radiusKm*radiusKm*radiusKm;

        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * pi * radiusMiles*radiusMiles*radiusMiles;

        System.out.printf("The volume of earth in cubic kilometers is " 
        + volumeKm3 + "and cubic miles is " +volumeMiles3);
    }
}


