//how to implement object in the priority queue as an priority 
import java.util.*;
public class PQ 
{   
    public static class Student implements Comparable<Student>
    {
        String name;
        int rank;
        public Student(String name,int rank)
        {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A" , 5));
        pq.add(new Student("B", 23));
        pq.add(new Student("C", 22));
        pq.add(new Student("D", 65));
        pq.add(new Student("E", 9));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name +"->"+ pq.peek().rank); //O(1)
            pq.remove();
        }
    }    
}
