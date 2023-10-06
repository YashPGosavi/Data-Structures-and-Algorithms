/*
Topological Sorting
        
        Directed Acyclic Graph(DAG) is a directed graph with no cycles.Topological sorting is used only for DAGs (not for non-DAGs).

        It is a linear order of vertices such that every directed edge u -> v, the vertex u comes before v in the order.
 */

import java.util.*;

public class _7_topologicalSorting {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void topSortUtil(ArrayList<Edge>[]graph,  int curr, boolean []visited, Stack<Integer> stack){

        visited[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                topSortUtil(graph, e.dest, visited, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge>[]graph,  int V){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<V;i++){
            if(!visited[i]){
                topSortUtil(graph, i, visited, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void main(String[] args) {

        int vertex = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        createGraph(graph);

        topSort(graph, vertex);
    }

}
