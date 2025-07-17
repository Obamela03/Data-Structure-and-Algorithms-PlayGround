# 🗺️ South African City Travel Optimizer 🚗

> **A Java program that uses Dijkstra’s Algorithm to find the shortest travel route between cities in South Africa.**
> Reads travel time data from a file and simulates optimal city-to-city travel planning.

---

## 📌 Features

- 🔄 Parses custom semicolon-delimited city data file
- 🌐 Models a weighted, directed graph
- 🧠 Implements Dijkstra’s algorithm for shortest path finding
- 📍 Outputs optimal path and total travel time
- 🛠 Easily extendable to include more cities, costs, or a UI

---

## 🧱 Data Format

Each line in the input file is structured like:
SOURCE;DEST1;TIME1;DEST2;TIME2;...
**Example:**
CPT;JNB;124;DUR;110;BFN;59

---

## 🧠 Algorithms & Design

- **Dijkstra’s Algorithm** – Efficient pathfinding using a priority queue
- **Graph Representation** – HashMap with adjacency lists (`Map<String, List<Edge>>`)
- **Modular OOP** – Clean separation between `Graph`, `Edge`, and `Dijkstra` logic

---

## 🖥️ How to Run

1. **Clone the repo:**
   ```bash
   git clone https://github.com/Obamela03/DSA.git
   cd your-repo

2. Open in IntelliJ IDEA (or any Java IDE)

3. Make sure your input file path is correct in Main.java
   Example:
   String filePath = "your path/airline_network.txt";

4. Run the Main class
   The program will print the shortest path and total travel time.


__

## 🛠 Technologies
Java 17+

IntelliJ IDEA

Git & GitHub