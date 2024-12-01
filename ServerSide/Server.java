package ServerSide;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Create service instance
            ServiceImplement service = new ServiceImplement();

            // Bind service to registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("MovieService", service);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
