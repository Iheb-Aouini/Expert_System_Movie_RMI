package Shared;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface InterfaceMovie extends Remote {
  public String recommendMovie(String genre, int year, double popularity, String favoriteActor, boolean isAbove18) throws RemoteException ;
  public String getRandomMovie() throws RemoteException ;
  public String searchMovie(String query) throws RemoteException ;

}
