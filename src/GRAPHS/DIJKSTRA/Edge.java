package GRAPHS.DIJKSTRA;

public class Edge <T>{
    T source, destination;
    int cost;

    Edge (T source, T destination, int cost){
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }
}
