public class pairs {
        public static void printpairs()
        {   
            int array[]={1,2,3,4,5};
            for (int i=0;i<array.length;i++)
            {   
                int current = array[i];
                for(int j=i+1;j<array.length;j++)
                {
                    System.out.print("("+current+","+array[j]+")");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        
        printpairs();
}
}