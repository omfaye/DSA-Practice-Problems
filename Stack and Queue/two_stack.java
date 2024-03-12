import java.util.*;
public class two_stack
{   
   
public static class queue
{   
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
   
    public static void add(int data)
    {
        
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
            
        }
        s1.push(data);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        
    }
    public static boolean isEmpty()
    {
        return s1.isEmpty();
    }
    public static void print()
    {
        while(!s1.isEmpty())
        {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
    
    public static void main(String args[])
    {
        queue Q = new queue();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.print();
    }
}