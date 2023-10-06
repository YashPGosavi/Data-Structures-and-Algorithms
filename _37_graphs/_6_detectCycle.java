/*
Cycle Detection
Directed Graph (DFS)

  1 ----- 0 ----- 2
           \     /
            \   /
              3

  1 -> 0 -> 2
        ↖  ↙
         3

*/

import java.util.*;

public class _6_detectCycle {

  static class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
      this.src = src;
      this.dest = dest;
    }
  }

  public static boolean hasCycle(ArrayList<Edge>[] graph, boolean[] visited, int curr, boolean rec[]) {

    visited[curr] = true;
    rec[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (rec[e.dest]) { // cycle
        return true;
      } else if (!visited[e.dest]) {
        if(hasCycle(graph, visited, e.dest, rec)){
          return true;
        }
      }
    }

    rec[curr] = false;
    return false;
  }

  public static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<Edge>();
    }
    graph[0].add(new Edge(0, 2));
    graph[1].add(new Edge(1, 0));
    graph[2].add(new Edge(2, 3));
    // graph[3].add(new Edge(3, 0));
  }

  public static void main(String[] args) {

    int vertex = 7;

    @SuppressWarnings("unchecked")
    ArrayList<Edge>[] graph = new ArrayList[vertex];

    createGraph(graph);

    System.out.println(hasCycle(graph, new boolean[vertex], 0, new boolean[vertex]));

  }

}
