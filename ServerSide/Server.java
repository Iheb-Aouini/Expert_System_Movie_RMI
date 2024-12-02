package ServerSide;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    private static final int PORT = 1099;

    public static void main(String[] args) {
        try {
            System.out.println("Initializing Movie Recommendation Server...");

            // Create service instance
            ServiceImplement service = new ServiceImplement();

            // Create RMI registry and bind service
            Registry registry = LocateRegistry.createRegistry(PORT);
            registry.rebind("MovieService", service);

            System.out.printf("🎥 Movie Recommendation Server is up and running on PORT %d!%n", PORT);
            System.out.println("Press Ctrl+C to stop the server.");
        } catch (Exception e) {
            System.err.println("❌ Error starting the Movie Recommendation Server:");
            e.printStackTrace();
        }
    }
}
