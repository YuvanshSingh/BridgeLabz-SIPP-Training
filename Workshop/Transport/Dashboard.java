package com.smartcity.transport;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Dashboard {
    private final List<TransportService> services = new ArrayList<>();
    private final List<Trip> trips = new ArrayList<>();

    public void registerService(TransportService s) { services.add(s); }

    public List<TransportService> findAvailable(GeoUtils.Location from, GeoUtils.Location to) {
        return services.stream()
                .filter(s -> s.isAvailable(from, to))
                .sorted(Comparator.comparingDouble(s -> s.estimateFare(from, to)))
                .collect(Collectors.toList());
    }

    public void displayLiveServices() {
        services.forEach(TransportService::printServiceDetails);
    }

    public void recordTrip(Trip t) { trips.add(t); }

    public void revenueReport() {
        System.out.println("\n--- Revenue Report ---");

        Map<String, List<Trip>> byRoute = trips.stream()
                .collect(Collectors.groupingBy(Trip::getRoute));

        byRoute.forEach((route, list) -> {
            double total = list.stream().mapToDouble(Trip::getFare).sum();
            System.out.printf("Route %s: trips=%d total=₹%.2f avg=₹%.2f\n",
                    route, list.size(), total, total / list.size());
        });

        Map<Boolean, List<Trip>> partitions = trips.stream()
                .collect(Collectors.partitioningBy(this::isPeakTime));
        System.out.printf("Peak trips: %d, Off-peak trips: %d\n",
                partitions.get(true).size(), partitions.get(false).size());

        DoubleSummaryStatistics stats = trips.stream()
                .collect(Collectors.summarizingDouble(Trip::getFare));
        System.out.printf("Total revenue: ₹%.2f, Average fare: ₹%.2f, Count: %d\n",
                stats.getSum(), stats.getAverage(), stats.getCount());
    }

    private boolean isPeakTime(Trip t) {
        int h = t.getTime().getHour();
        return (h >= 7 && h <= 10) || (h >= 17 && h <= 20);
    }
}
