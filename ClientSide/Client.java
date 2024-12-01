package ClientSide;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import Shared.InterfaceMovie;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to RMI server
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            InterfaceMovie service = (InterfaceMovie) registry.lookup("MovieService");

            // Collect user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("--- Welcome to the Movie Recommendation Expert System! --- \n\n");

            System.out.print("Enter your preferred genre: ");
            String genre = scanner.nextLine();

            System.out.print("Enter the minimum release year: ");
            int year = scanner.nextInt();

            System.out.print("Enter minimum popularity (0-10): ");
            double popularity = scanner.nextDouble();

            System.out.print("Enter your favorite actor: ");
            scanner.nextLine(); // Consume newline
            String favoriteActor = scanner.nextLine();

            System.out.println("Are you above 18? (yes/no)");
            String isAbove18 = scanner.nextLine();
            boolean above18 = isAbove18.equalsIgnoreCase("yes");

            // Send this boolean to the server as part of the request
          //  List<Movie> recommendedMovies = movieService.getMovies(above18);


            // Get recommendation
            String recommendation = service.recommendMovie(genre, year, popularity, favoriteActor, above18);
            System.out.println("Recommended movie: " + recommendation);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
