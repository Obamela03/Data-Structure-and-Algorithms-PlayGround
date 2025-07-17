package GRAPHS.DIJKSTRA;

public class Node <T>{

    T vertex;
    int distance;

    Node(T vertex, int distance){
        this.vertex = vertex;
        this.distance = distance;
    }
}
