import java.util.*;
public class add_heap 
{   
    //min heap code
    static class heap
    {
        ArrayList<Integer> ar = new ArrayList<>();
        public void add(int data)
        {
            ar.add(data);
            int x = ar.size()-1; //child index
            int par = (x-1)/2; 
            while(ar.get(x) < ar.get(par))
            {
                int temp = ar.get(x);
                ar.set(x, ar.get(par));
                ar.set(par, temp);

                x = par;
                par = (x-1)/2;
            }

        }
        public int peek()
        {
            return ar.get(0);
        }
        private void heapify(int i) //TC is O(log n)
        {
            int left = 2*i + 1;
            int right =2*i + 2;
            int minIdx = i;

            if(left < ar.size() && ar.get(minIdx) > ar.get(left) )
            {
                minIdx = left;
            }
            if(right < ar.size() && ar.get(minIdx) > ar.get(right) )
            {
                minIdx = right;
            }

            //swap 
            if(minIdx != i)
            {
                int temp = ar.get(i);
                ar.set(i, ar.get(minIdx));
                ar.set(minIdx, temp);
                heapify(minIdx);
            }

        }
        public int remove()
        {
            int data = ar.get(0);
            //step 1-swap first and last
            int temp = ar.get(0);
            ar.set(0,ar.get(ar.size()-1));
            ar.set(ar.size()-1,temp);

            //step 2- delete last 
            ar.remove(ar.size()-1);

            //step 3- heapify
            heapify(0);
            return data;

        }
        public boolean isEmpty()
        {
            return ar.size() == 0;
        }
    }
    public static void main(String[] args) 
    {
        heap hp = new heap();
        hp.add(1);
        hp.add(3);
        hp.add(6);
        hp.add(2);

        while(!hp.isEmpty())
        {
            System.out.println(hp.peek());
            hp.remove();
        }

    }
}
