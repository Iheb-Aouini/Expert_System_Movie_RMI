package ServerSide;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import Shared.InterfaceMovie;


public class ServiceImplement extends UnicastRemoteObject implements InterfaceMovie {

    private static final List<Movie> movieDatabase = new ArrayList<>();

    protected ServiceImplement() throws RemoteException {
        super();
        // Hardcoded movie database
    movieDatabase.add(new Movie("Inception", "Sci-Fi", 2010, 9.0, "Leonardo DiCaprio", false, "A thief who steals corporate secrets through dream-sharing technology is tasked with planting an idea into a CEO's mind.", 8.8));
    movieDatabase.add(new Movie("The Godfather", "Crime", 1972, 9.2, "Marlon Brando", true, "The aging patriarch of an organized crime dynasty transfers control to his reluctant son.", 9.2));
    movieDatabase.add(new Movie("Toy Story", "Animation", 1995, 8.3, "Tom Hanks", false, "A cowboy doll is profoundly threatened and jealous when a new spaceman figure supplants him as top toy.", 8.3));
    movieDatabase.add(new Movie("The Dark Knight", "Action", 2008, 9.0, "Christian Bale", true, "Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.", 9.0));
    movieDatabase.add(new Movie("Pulp Fiction", "Crime", 1994, 8.9, "John Travolta", true, "The lives of two mob hitmen, a boxer, and others intertwine in tales of violence and redemption.", 8.9));
    movieDatabase.add(new Movie("Forrest Gump", "Drama", 1994, 8.8, "Tom Hanks", false, "The life and times of a slow-witted but kind-hearted man from Alabama.", 8.8));
    movieDatabase.add(new Movie("The Matrix", "Sci-Fi", 1999, 8.7, "Keanu Reeves", true, "A hacker learns about the true nature of reality and his role in the war against its controllers.", 8.7));
    movieDatabase.add(new Movie("The Lion King", "Animation", 1994, 8.5, "Matthew Broderick", false, "A young lion prince flees his kingdom only to learn the true meaning of responsibility and bravery.", 8.5));
    movieDatabase.add(new Movie("Titanic", "Romance", 1997, 7.8, "Leonardo DiCaprio", false, "A love story unfolds between two passengers from different social classes aboard the ill-fated Titanic.", 7.8));
    movieDatabase.add(new Movie("Schindler's List", "Drama", 1993, 9.0, "Liam Neeson", true, "A businessman saves the lives of Jewish refugees during the Holocaust by employing them in his factories.", 9.0));
    movieDatabase.add(new Movie("Avengers: Endgame", "Action", 2019, 8.4, "Robert Downey Jr.", true, "The Avengers assemble one final time to reverse the damage caused by Thanos.", 8.4));
    movieDatabase.add(new Movie("Jurassic Park", "Adventure", 1993, 8.2, "Sam Neill", false, "A theme park featuring cloned dinosaurs spirals into chaos when a power failure allows the creatures to escape.", 8.2));
    movieDatabase.add(new Movie("Harry Potter and the Sorcerer's Stone", "Fantasy", 2001, 7.6, "Daniel Radcliffe", false, "An orphaned boy discovers he's a wizard and attends a magical school to learn about his destiny.", 7.6));
    movieDatabase.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", 2001, 8.8, "Elijah Wood", false, "A young hobbit sets out on a quest to destroy a powerful ring before it falls into the wrong hands.", 8.8));
    movieDatabase.add(new Movie("Interstellar", "Sci-Fi", 2014, 8.6, "Matthew McConaughey", false, "A team of explorers travels through a wormhole in space in an attempt to ensure humanity's survival.", 8.6));
    movieDatabase.add(new Movie("Parasite", "Thriller", 2019, 8.6, "Song Kang-ho", true, "Greed and class discrimination threaten the newly-formed symbiotic relationship between a wealthy family and a poor one.", 8.6));
    movieDatabase.add(new Movie("Joker", "Drama", 2019, 8.5, "Joaquin Phoenix", true, "A mentally troubled comedian spirals into a life of crime and becomes a symbol for rebellion.", 8.5));


        // Add more movies...
    }

    @Override
    public String recommendMovie(String genre, int year, double popularity, String favoriteActor, boolean isAbove18) throws RemoteException {
        // Filter movies based on user input
        return movieDatabase.stream()
            .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
            .filter(movie -> movie.getYear() >= year)
            .filter(movie -> movie.getPopularity() >= popularity)
            .filter(movie -> movie.getActor().equalsIgnoreCase(favoriteActor))
            .filter(movie -> isAbove18 || !movie.isAbove18()) // Check age restrictions
            .map(Movie::toString) // Map to movie name
            .findFirst()
            .orElse("No recommendations match your preferences!");
    }







        // Movie class
        static class Movie {
          private String title;
          private String genre;
          private int year;
          private double popularity;
          private String leadActor;
          private boolean isAbove18;
          private String description;  // New field
          private double rating;       // New field

          public Movie(String title, String genre, int year, double popularity, String leadActor, boolean isAbove18, String description, double rating) {
              this.title = title;
              this.genre = genre;
              this.year = year;
              this.popularity = popularity;
              this.leadActor = leadActor;
              this.isAbove18 = isAbove18;
              this.description = description;
              this.rating = rating;
          }


          // Add getter methods
  public String getTitle() {
      return title;
  }

  public String getGenre() {
      return genre;
  }

  public int getYear() {
      return year;
  }

  public double getPopularity() {
      return popularity;
  }

  public String getActor() {
      return leadActor;
  }

  public boolean isAbove18() {
      return isAbove18;
  }

  public String getDescription() {
      return description;
  }

  public double getRating() {
      return rating;
  }

          // Add getters and override toString to include description and rating
          @Override
          public String toString() {
              return title + " (" + year + ") - Genre: " + genre +
                     "\nLead Actor: " + leadActor +
                     "\nPopularity: " + popularity +
                     "\nRating: " + rating + "/10" +
                     "\nDescription: " + description + "\n";
          }
      }
}
