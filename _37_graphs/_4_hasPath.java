/*
Has Path ?
For given src & dest, tell if a path exists from sre to dest
sre = 0, dest = 5
 */
import java.util.*;

public class _4_hasPath {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // TC = O(V+E)
    public static boolean hasPath(ArrayList<Edge>[] graph, int sr,int dest, boolean []visited){

        if(sr==dest){
            return true;
        }

        visited[sr]=true;

        for(int i=0;i<graph[sr].size();i++){
            Edge e = graph[sr].get(i);

            // dest = neighbour

            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited) ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

/*
            
       0 ------- 1 ------- 3 --- 5 ------- 6
        \                  |   / 
         \                 |  /       
           2 ------------- 4 /

*/
        int vertex = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[vertex];

        for(int i=0;i<vertex;i++){
            graph[i]=new ArrayList<>();
        }

        //0
        graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

         // 1
         graph[1].add(new Edge(1, 0, 0));
         graph[1].add(new Edge(1, 3, 0));
 
         // 2
         graph[2].add(new Edge(2, 0, 0));
         graph[2].add(new Edge(2, 4, 0));
 
         // 3
         graph[3].add(new Edge(3, 1, 0));
         graph[3].add(new Edge(3, 4, 0));
 
         // 4
         graph[4].add(new Edge(4, 2, 0));
         graph[4].add(new Edge(4, 3, 0));
         graph[4].add(new Edge(4, 5, 0));

         // 5
         graph[5].add(new Edge(5, 3, 0));
         graph[5].add(new Edge(5, 4, 0));
         graph[5].add(new Edge(5, 6, 0));

         // 6
         graph[6].add(new Edge(6, 5, 0));

         System.out.println(hasPath(graph, 0, 5, new boolean[vertex]));

    }
}
