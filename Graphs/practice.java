import java.util.*;
public class practice
{
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt)
        {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    
    public static void createGraph(ArrayList<Edge> Graph[])
    {
        for(int i=0;i<Graph.length;i++)
        {
            Graph[i] = new ArrayList<>();
        }
        
        Graph[0].add(new Edge(0,1,1));
        Graph[0].add(new Edge(0,2,1));
        Graph[1].add(new Edge(1,3,1));
        Graph[1].add(new Edge(1,0,1));
        Graph[2].add(new Edge(2,0,1));
        Graph[2].add(new Edge(2,4,1));
        Graph[3].add(new Edge(3,1,1));
        Graph[3].add(new Edge(3,4,1));
        Graph[3].add(new Edge(3,5,1));
        Graph[4].add(new Edge(4,2,1));
        Graph[4].add(new Edge(4,3,1));
        Graph[4].add(new Edge(4,5,1));
        Graph[5].add(new Edge(5,3,1));
        Graph[5].add(new Edge(5,4,1));
        Graph[5].add(new Edge(5,6,1));
        Graph[6].add(new Edge(6,5,1));
    }
    
    public static void bfsUtil(ArrayList<Edge> Graph[])
    {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[Graph.length];
        q.add(0);
        while(q.isEmpty())
        {
            int curr = q.remove();
            if(!vis[curr])
            {
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0;i<Graph[curr].size();i++)
                {
                    Edge e = Graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String args[])
    {
        int V = 7;
        ArrayList<Edge> Graph[] = new ArrayList[V];
        createGraph(Graph);
        bfsUtil(Graph);

        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}