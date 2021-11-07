import java.util.*;

public class graphIntialization{


    public static class Edge {
        int src;
        int destination;
        int weight;

        Edge(){}
        Edge(int src , int destination, int weight){
            this.src = src;
            this.destination = destination;
            this.weight = weight;

        }
    }
    public static void addEdge(ArrayList<Edge> [] graph,int src,int destination , int weight){
        System.out.println(src + " => " + destination);
        graph[src].add(new Edge(src, destination, weight));
        graph[destination].add( new Edge(destination, src, weight));
    }
    public static void displayGraph(ArrayList<Edge>[] graph ){
        // for( Edge e: graph[])
        for( ArrayList<Edge> list : graph){

            for(Edge e : list){
                System.out.println("src is" + " " + e.src + " pointing to destination" + " " + e.destination + " weight is => " + e.weight );
            }
        }

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numberOfItems = scn.nextInt();

        // for(int i=0; i< n; i++){
        //     System.out.println("hey");

        // }

        ArrayList<Edge> [] graph = new ArrayList[numberOfItems + 1];
        // now at each index of the graph array , null
        // will be placed for now , to fill it with Array
        for( int pos=0; pos<graph.length; pos++){
            graph[pos] = new ArrayList<>();
        }

        while(numberOfItems-- >0){
            int src = scn.nextInt();
            int destination = scn.nextInt();
            int weight =scn.nextInt();
            addEdge(graph,src, destination , weight);
        }
        displayGraph(graph);
       
        // graph[src].add(new Edge(src, destination, weight));
        // graph[destination].add( new Edge(destination, src, weight));


    }
}
