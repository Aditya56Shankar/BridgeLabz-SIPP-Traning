import java.util.*;
import java.util.stream.*;

class Reading {
    private int value; // in kW
    public Reading(int value) { this.value = value; }
    public int getValue() { return value; }
}

public class SmartGridTracker {
    public static void main(String[] args) {
        // Data structure: Map<Zone, Map<Day, List<Reading>>>
        Map<String, Map<String, List<Reading>>> energyData = new HashMap<>();

        // Zone-A, Day-2025-08-01
        energyData.putIfAbsent("Zone-A", new HashMap<>());
        energyData.get("Zone-A").put("2025-08-01",
                Arrays.asList(new Reading(120), new Reading(90), new Reading(200), new Reading(150)));

        // Zone-B, Day-2025-08-01
        energyData.putIfAbsent("Zone-B", new HashMap<>());
        energyData.get("Zone-B").put("2025-08-01",
                Arrays.asList(new Reading(300), new Reading(350), new Reading(250)));

        // --- Stream Processing: Find Peak Load ---
        energyData.forEach((zone, dayMap) -> {
            dayMap.forEach((day, readings) -> {
                int peak = readings.stream()
                                   .mapToInt(Reading::getValue)
                                   .max()
                                   .orElse(0);
                System.out.println(zone + " | " + day + " | Peak = " + peak + " kW");
            });
        });
    }
}
