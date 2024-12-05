# Movie Recommendation System with Java RMI

This project implements a **distributed movie recommendation system** using **Java RMI**. It supports **multithreaded server-side processing**, enabling multiple clients to request movie recommendations simultaneously. The server processes client requests, such as recommending movies, searching for specific titles, and suggesting random movies, based on a hardcoded database.

---

## Features

- **Personalized Movie Recommendations**: Users can input preferences (e.g., genre, year, popularity, actor) to get tailored movie suggestions.
- **Multithreaded Server**: Each client request is handled in a separate thread to ensure concurrency and scalability.
- **Search by Title**: Users can search for specific movies by title or part of an actor's name.
- **Random Movie Suggestions**: For indecisive users, the system provides a random movie suggestion.
- **LAN Compatibility**: The server can handle client requests over a local network.

---

## Project Structure

MovieRecommendationSystem/ ├── src/ │ ├── ClientSide/ │ │ └── Client.java # Client-side application │ ├── ServerSide/ │ │ ├── Server.java # RMI server │ │ └── ServiceImplement.java # Server-side implementation │ ├── Shared/ │ │ └── InterfaceMovie.java # Shared interface for RMI methods ├── README.md 


---

## Technologies Used

- **Java RMI**: Enables remote communication between clients and the server.
- **Multithreading**: Handles concurrent requests efficiently using threads.
- **Middleware Concepts**: Includes RMI registry, stubs, and skeletons for seamless communication.
- **Hardcoded Database**: Static in-memory database for movies.

---

## How It Works

### Workflow

1. **Client**:
   - Connects to the RMI server via the RMI registry.
   - Sends a request (e.g., recommendMovie, searchMovie).
   - Displays the response from the server.

2. **Server**:
   - Processes client requests using separate threads.
   - Uses a hardcoded movie database for recommendations.
   - Sends the results back to the client.

### Communication

1. The client calls a remote method (`recommendMovie`) using RMI.
2. The server processes the request in a new thread.
3. The server sends the result back to the client after processing.

---

## Setup and Usage

### Prerequisites

- JDK 8 or higher
- RMI-compatible environment

### Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Iheb-Aouini/Expert_System_Movie_RMI
   cd Expert_System_Movie_RMI

### Compile the Project
 to compile :

javac ServerSide/Server.java ServerSide/ServiceImplement.java  
javac ClientSide/*.java



### to execute :

java ServerSide.Server 
java ClientSide.Client 


--- Recommendation Result ---

Improvements
Potential future improvements include:

Adding a GUI for a better user experience.
Using a database instead of a hardcoded list.

Contributors
Iheb Aouini

### License
This project is licensed under the MIT License. See the LICENSE file for details.



Let me know if you need help refining this further or adding more details!



