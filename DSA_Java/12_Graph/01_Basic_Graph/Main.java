import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int v = 4;

        Scanner read = new Scanner(System.in);
        ArrayList<Edge> graph[] = new ArrayList[v];

        // Creating Graph
        createGraph(graph);

        // Printing neighbours
        int searchNeighbourOf = read.nextInt();
 
        for(int i=0; i<graph[searchNeighbourOf].size(); i++){
            Edge e = graph[searchNeighbourOf].get(i);
            System.out.print(e.destination + " ");
            System.out.println(e.weight + " ");
        }
    }

    // creating edge(joining vertex)
    static class Edge{
        int src;
        int destination;
        int weight;

        public Edge(int s, int d, int w){
            this.src = s;
            this.destination = d;
            this.weight = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        } 

        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,  -1));

        graph[3].add(new Edge(3,2, -1));
        graph[3].add(new Edge(3,1,0));

    }
}