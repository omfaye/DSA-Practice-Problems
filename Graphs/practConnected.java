import java.util.*;
public class practConnected
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
        // graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        // // graph[2].add(new Edge(2,3));
        // graph[3].add(new Edge(3,1));
        // graph[3].add(new Edge(3,2));
        // graph[3].add(new Edge(3,4));
        // graph[4].add(new Edge(4,3));
        
    }
    
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
    
    public static boolean dfsUtil(ArrayList<Edge> graph[],boolean vis[],int curr,int par)
    {
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] && e.dest !=par )
            {
                return true;
            }
            else if(!vis[e.dest])
            {
                dfsUtil(graph,vis,e.dest,curr);
            }
        }
        return false;
    }
    public static void main(String []args)
    {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        
        for(int i=0;i<graph[2].size();i++)
        {
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println(dfs(graph));
    }
    
    
    
}