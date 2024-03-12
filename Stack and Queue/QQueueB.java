public class QQueueB
{
    public static class queue
    {
        static int rear = -1;
        static int n;
        static int size;
        static int array[];
        queue(int n)
        {
            rear = -1;
            array = new int[n];
            size = n;
        }
    
    
    public static boolean isEmpty()
    {
        if(rear==-1)
        {
            return true;
        }
        return false;
    }
    
    public static void addQueue(int data)
    {
        if(isEmpty())
        {
            rear = rear+1;
            array[rear] = data;
            return;
        }
        rear = rear+1;
        array[rear] = data;
       
    }
    
    public static void print()
    {
        int temp =0;
        while(temp<size)
        {
            System.out.println(array[temp]);
            temp++;
        }
    }

    public static void deleteQueue()
    {
        
    }
    
    
    }
    public static void main(String args[])
    {
        queue Q = new queue(2);
        Q.addQueue(1);
        Q.addQueue(2);
        Q.print();
    }
}