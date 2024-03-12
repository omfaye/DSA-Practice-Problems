import java.util.*;
public class ConnectedGraph
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
    
    
    public static void createGraph(ArrayList<Edge> graph[],int V)
    {   
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,0));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));
        
    }
    
    // public static void dfs(ArrayList<Edge> graph[],int src,boolean vis[])
    // {       
    //     System.out.print(src+" ");
    //     vis[src] = true;
    //     for(int i=0;i<graph[src].size();i++)
    //     {   
    //         Edge e = graph[src].get(i);
    //         if(!vis[e.dest])
    //         {
    //             dfs(graph,e.dest,vis);
    //         }
    //     }
    // }
    
    public static boolean dfs(ArrayList<Edge> graph[])
    {
        boolean vis[] = new boolean[graph.length];
   
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                if(dfsUtil(graph,vis,i,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfsUtil(ArrayList<Edge> graph[],boolean vis[] , int curr , int par)
    {
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++)
        {   
            Edge e = graph[curr].get(i);
            //case1
            if(!vis[e.dest])
            {
                if(dfsUtil(graph,vis,e.dest,curr))
                {
                    return true;
                }
            }
            //case2
            else if(vis[e.dest] && e.dest!=par)
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String []args)
    {
        int V = 8;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph,V);
        System.out.println(dfs(graph));
        
        
    }
}