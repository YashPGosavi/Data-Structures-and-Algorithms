/*
* BFS (Breadth First Search)
        1. BFS is an algorithm that visits each node in a graph or tree by exploring all the neighbor nodes at the present depth before moving on to nodes at the next depth level. 
        2. This algorithm follows the FIFO (First-In-First-Out) queue(neighbour Node) and Array(visited Node) data structure. 
        3. It starts from a root node and explores all the nodes at the present depth before moving on to the next depth level.


* Applications of BFS:
    1. Shortest path
    2. Maze solving
    3. Minimum Spanning Trees
    3. Social networking


 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _2_bfsInGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // bfs --> TC = O(V+E)
    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);// source node

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {

/*
            (2)
        0 ------ 1
                 /\
            (4) /  \ (3)
               /    \
             2 ----- 3
             |
             | (2)
             |
             4
*/
        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        for (int i = 0; i < vertex; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0
        graph[0].add(new Edge(0, 1, 2));

        // 1
        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 2, 4));
        graph[1].add(new Edge(1, 3, 3));

        // 2
        graph[2].add(new Edge(2, 1, 4));
        graph[2].add(new Edge(2, 4, 2));

        // 3
        graph[3].add(new Edge(3, 1, 3));

        // 4
        graph[4].add(new Edge(4, 2, 2));

        bfs(graph);
    }
}
