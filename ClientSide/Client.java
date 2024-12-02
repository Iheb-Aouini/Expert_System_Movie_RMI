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

            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            System.out.println("\n--- Welcome to the Movie Recommendation Expert System! ---");
            while (!exit) {
                System.out.println("\nPlease select an option:");
                System.out.println("1. Get a Random Movie");
                System.out.println("2. Recommend a Movie");
                System.out.println("3. Search for Movies");
                System.out.println("4. Exit");

                System.out.print("Your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1: // Random Movie
                        try {
                            String randomMovie = service.getRandomMovie();
                            System.out.println("\n🎥 Random Movie: " + randomMovie);
                        } catch (Exception e) {
                            System.out.println("Error fetching random movie: " + e.getMessage());
                        }
                        break;

                    case 2: // Recommend Movie
                        try {
                            System.out.print("\nEnter your preferred genre: ");
                            String genre = scanner.nextLine();

                            System.out.print("Enter the minimum release year: ");
                            int year = scanner.nextInt();

                            System.out.print("Enter minimum popularity (0-10): ");
                            double popularity = scanner.nextDouble();
                            scanner.nextLine(); // Consume newline

                            System.out.print("Enter your favorite actor: ");
                            String favoriteActor = scanner.nextLine();

                            System.out.print("Are you above 18? (yes/no): ");
                            String isAbove18 = scanner.nextLine();
                            boolean above18 = isAbove18.equalsIgnoreCase("yes");

                            String recommendation = service.recommendMovie(genre, year, popularity, favoriteActor, above18);
                            System.out.println("\n🎬 Recommended Movie: " + recommendation);
                        } catch (Exception e) {
                            System.out.println("Error fetching recommendation: " + e.getMessage());
                        }
                        break;

                    case 3: // Search for Movies
                        try {
                            System.out.print("\nEnter a search query (title/description): ");
                            String query = scanner.nextLine();

                            String searchResults = service.searchMovie(query);
                            System.out.println("\n🔍 Search Results: \n" + searchResults);
                        } catch (Exception e) {
                            System.out.println("Error searching movies: " + e.getMessage());
                        }
                        break;

                    case 4: // Exit
                        System.out.println("\nThank you for using the Movie Recommendation System! Goodbye!");
                        exit = true;
                        break;

                    default:
                        System.out.println("\nInvalid choice! Please try again.");
                }
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error connecting to the server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
