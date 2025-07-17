package GRAPHS.DIJKSTRA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        GRAPH<String> graph = new GRAPH<>(true);
        String sourceVertices = "CPT";
        String filePath = "C:\\Users\\obame\\OneDrive\\Desktop\\airline-network.csv"; // update to match your file location

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String source = parts[0].trim();

                for (int i = 1; i < parts.length - 1; i += 2) {
                    String dest = parts[i].trim();
                    int time = Integer.parseInt(parts[i + 1].trim());

                    graph.addEdge(source, dest, time);  // bidirectional assumed
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Example call to Dijkstra
        Map<String, Integer> shortestPaths = graph.Dijkstra(sourceVertices);
        System.out.println("\nShortest distances from :" + sourceVertices);
        for (Map.Entry<String, Integer> entry : shortestPaths.entrySet()) {
            if (entry.getValue() == Integer.MAX_VALUE) {
                System.out.println("To " + entry.getKey() + " = ∞ (Unreachable)");
            } else {
                if (entry.getKey().equals(sourceVertices)) {
                    System.out.println("To " + entry.getKey() + "(source) = " + entry.getValue());
                }else{
                    System.out.println("To " + entry.getKey() + " = " + entry.getValue());
                }
            }
        }
    }
}
