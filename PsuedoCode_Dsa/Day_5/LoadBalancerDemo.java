import java.util.*;

class LoadBalancer {
    private Queue<String> servers;

    public LoadBalancer() {
        servers = new LinkedList<>();
    }

    public void addServer(String serverName) {
        servers.add(serverName);
        System.out.println("Server " + serverName + " added.");
    }

    public void removeServer(String serverName) {
        if (servers.remove(serverName)) {
            System.out.println("Server " + serverName + " removed.");
        } else {
            System.out.println("Server " + serverName + " not found.");
        }
    }

    public String getNextServer() {
        if (servers.isEmpty()) {
            return "No server available!";
        }
        String server = servers.poll();   // take from front
        servers.add(server);              // put it at back
        return server;
    }
}

public class LoadBalancerDemo {
    public static void main(String[] args) {
        LoadBalancer lb = new LoadBalancer();

        // Initial servers
        lb.addServer("S1");
        lb.addServer("S2");
        lb.addServer("S3");

        // Process 3 requests
        for (int i = 1; i <= 3; i++) {
            System.out.println("Request R" + i + " → " + lb.getNextServer());
        }

        // Add new server S4
        lb.addServer("S4");

        // Process more requests
        for (int i = 4; i <= 6; i++) {
            System.out.println("Request R" + i + " → " + lb.getNextServer());
        }

        // Remove server S2
        lb.removeServer("S2");

        // Process more requests
        for (int i = 7; i <= 9; i++) {
            System.out.println("Request R" + i + " → " + lb.getNextServer());
        }
    }
}
