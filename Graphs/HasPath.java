import java.util.*;
public class HasPath
{
    static class Edge
    {
        int src;
        int dest;
        Edge(int src,int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,0));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        //
        //                           3 
        //              1            |  \
        //            /              |   5      src = 0 
        //          0                |  /       dest = 5
        //            \              4          return false;
        //             2
        //

        
    }
    public static boolean hasPath(int src,int dest,ArrayList<Edge> graph[],boolean vis[])
    {   
        if(src==dest)
        {
            return true;
        }
        vis[src] = true;
        for(int i=0;i<graph[src].size();i++)
        {
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(e.dest,dest,graph,vis))
            {
                return true;
            }
        }
        return false;
        
    }
    public static void main(String []args)
    {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(hasPath(0,5,graph,new boolean[V]));    
    }
}