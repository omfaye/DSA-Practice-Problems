import java.util.*;
public class bfsPract
{   
    static class Edge
    {
        int src;
        int dest;
        public Edge(int src,int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,4));
        graph[1].add(new Edge(1,5));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,1));
        graph[5].add(new Edge(5,4));
        
    }
    
    public static void bfs(ArrayList<Edge>graph[])
    {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[8];
        q.add(0);
        while(!q.isEmpty())
        {
            int curr = q.remove();
            if(!vis[curr])
            {
                vis[curr] = true;
                System.out.print(curr+" ");
                    for(int i=0;i<graph[curr].size();i++)
                    {
                        Edge e = graph[curr].get(i);
                        if(!vis[e.dest])
                        {
                            q.add(e.dest);
                        }
                    }
            }
           
        }
    }

    public static void main(String []args)
    {
        int V = 8;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
        
    }  
}