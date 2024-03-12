import java.util.*;
public class QueueB
{
     static class Queue
    {
        static int rear;
        static int arr[];
        static int size;
        static int n;
        Queue(int n)
        {
            rear = -1;
            arr = new int[n];
            size = n;
        }
        
        static boolean isEmpty()
        {
            return rear==-1;
        }
        
        public static void add(int data)
        {   
            if(rear == size-1)
            {   
                System.out.println("Queue is full");
                return ;            
            }
            
            rear = rear+1;
            arr[rear] = data;
            
        }
        //remove
        public static int remove()
        {
            if(isEmpty())
            {   
                System.out.println("empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        
        public static int peek()
        {
            if(isEmpty())
            {   
                System.out.println("empty Queue");
                return -1;
            }
            int front = arr[0];
            return front;
        }
        
    }
    public static void main(String args[])
    {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    
    
}