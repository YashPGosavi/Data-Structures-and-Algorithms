/*
Node/ Vertes
edge --> line which connect veretexes.
______________________________________________________

* Edges in Graph

    1. Unidirectional Edge -->
        example :-
                    1 --> 2

    2. Undirected Edge -->
        example :-
                    1 -- 2

    3. Bi-derectional Edges -->
        example :-
                    1 --> 2
                      <--
__________________________________________________________

* Types of Graphs
    1. Weigted Graph :- Present a value on vertex

    2. UnWeigted Graph :- Does Not Present a value on vertex
__________________________________________________________

* Storing a Graph / Representing a graph
        1. Adjacency List
        2. Adjacency Matrix
        3. Edge List
        4. 2D Matrix (Implicit Graph)

1. Adjacency List (It is most optimise approch to store graph data structure)
Time complexity :- 0(Edges)
       0------1-----3
              |     | 
              |_____2

        * Adjency list becomes 
                    0 --> [1]
                    1 --> [0,2,3]
                    2 --> [1,3]
                    3 --> [1,2]


2. Adjacency Matrix
Time complexity :- 0(Vertex)
       0------1-----3
              |     | 
              |_____2

When the edge connection in present then we write 1( its weight for weighted graph ) else 0

           0  1   2   3  
          ________________            
        0| 0 | 1 | 0 | 0 |
          ––––––––––––––––
        1| 1 | 0 | 1 | 1 |
          ––––––––––––––––
        2| 0 | 1 | 0 | 1 |
          ––––––––––––––––
        3| 0 | 1 | 1 | 0 |
          ––––––––––––––––


3. Edge List
       0------1-----3
              |     | 
              |_____2

        Edges = (0, 1), (1, 2), (1, 3), (2, 3))

4. Implicit Graph
__________________________________________________________

* Applications of Graphs

        a. MAPS (Shorted path)
        b. SOCIAL NETWORK
        c. DELIVERY NETWORK (Shortest Cyclic Route)
        d. PHYSICS & CHEMISTRY
        e. ROUTING ALGORITHMS
        f. MACHINE LEARNING (Computation Graphs)
        g. DEPENDENCY GRAPH
        h. COMPUTER VISION
        i. GRAPH DATABASES
        j. RESEARCH 


 */

 // Create a Graph --> Adjacency List 
 // Edge = (src, dest, weight)

import java.util.*;
public class _1_introductionAndImplementGraph {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {

        /*        (5)
            0 ------------ 1 
                          / \
                    (1)  /   \ (3)
                        /     \
                       2 ----- 3
                       |  (1)
                   (2) |
                       |
                       4      

         */

        int vertex = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        for(int i=0;i<vertex;i++){
            graph[i]=new ArrayList<>();
        }

        // 0 - vertex
        graph[0].add(new Edge(0,1,5));

        // 1 - vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // 2 - vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        // 3 - vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4 - vertes
        graph[4].add(new Edge(4,2,2));


        // for printing neibour of 2's vertes

        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }

    }
}
