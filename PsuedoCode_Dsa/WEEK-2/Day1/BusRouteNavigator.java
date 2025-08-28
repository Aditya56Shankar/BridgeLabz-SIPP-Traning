import java.util.*;

class BusRouteNavigator {
    private LinkedList<String> route = new LinkedList<>();

    // Initialize route
    public void addInitialStops(String... stops) {
        route.addAll(Arrays.asList(stops));
    }

    // Insert a stop after a given stop
    public void insertStop(String afterStop, String newStop) {
        int index = route.indexOf(afterStop);
        if(index != -1) {
            route.add(index + 1, newStop);
            System.out.println("Added stop: " + newStop + " after " + afterStop);
        } else {
            System.out.println("Stop " + afterStop + " not found!");
        }
    }

    // Remove a stop
    public void removeStop(String stop) {
        if(route.remove(stop)) {
            System.out.println("Removed stop: " + stop);
        } else {
            System.out.println("Stop " + stop + " not found!");
        }
    }

    // Search for a stop
    public void searchStop(String stop) {
        if(route.contains(stop)) {
            System.out.println("Yes, " + stop + " is on the route.");
        } else {
            System.out.println("No, " + stop + " is not on the route.");
        }
    }

    // Display full route
    public void displayRoute() {
        System.out.println("Current Route: " + route);
    }

    // Example Run
    public static void main(String[] args) {
        BusRouteNavigator bus = new BusRouteNavigator();
        bus.addInitialStops("Depot", "Main Street", "City Mall", "Hospital", "Airport");

        bus.displayRoute();

        bus.insertStop("City Mall", "University"); // add detour
        bus.displayRoute();

        bus.removeStop("Hospital"); // remove stop
        bus.displayRoute();

        bus.searchStop("Airport"); // passenger query
    }
}
