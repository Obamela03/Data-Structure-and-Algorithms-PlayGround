package DIJKSTRA;

import java.util.*;

public class GRAPH <T>{

    private Map<T, List<Edge<T>>> adjList;
    private boolean isDirected;

    public GRAPH(boolean isDirected){
        adjList = new HashMap<>();
        this.isDirected = isDirected;
    }

    //Adds a vertex to the graph
    public void addVertex(T vertex){
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    //Adds an edge between vertices
    public void addEdge(T source, T destination, int cost){
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());

        adjList.get(source).add(new Edge<>(source, destination, cost));
        if (!isDirected){
            adjList.get(destination).add(new Edge<>(destination, source, cost));
        }
    }

    public void printGraph(){
        for (T vertex : adjList.keySet()){
            System.out.print(vertex + " -> ");
            for (Edge<T> edge : adjList.get(vertex)){
                System.out.print("(" + edge.destination + ", " + edge.cost + ") ");
            }
            System.out.println();
        }
    }

    //DIJKSTRA'S ALGORITHM
    public Map<T, Integer> Dijkstra(T source){
        Map<T, Integer> distances = new HashMap<>();
        Set<T> visited = new HashSet<>();
        PriorityQueue<Node<T>> PQ = new PriorityQueue<>(Comparator.comparingInt(n -> n.distance));

        //Initialise the distances
        for (T vertex : adjList.keySet()){
            distances.put(vertex, Integer.MAX_VALUE);
        }

        distances.put(source, 0);
        PQ.offer(new Node<>(source, 0));

        while(!PQ.isEmpty()){
            Node<T> current = PQ.poll();
            if (visited.contains(current .vertex))
                continue;

            visited.add(current.vertex);

            for (Edge<T> edge : adjList.getOrDefault(current.vertex, new ArrayList<>())){
                int newDistance = distances.get(current.vertex) + edge.cost;
                if (newDistance < distances.get(edge.destination)){
                    distances.put(edge.destination, newDistance);
                    PQ.offer(new Node<>(edge.destination, newDistance));
                }
            }
        }
        return distances;
    }
}
