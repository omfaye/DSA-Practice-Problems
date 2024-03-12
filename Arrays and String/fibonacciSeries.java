class HelloWorld {
    public static int fib(int n)
    {   
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
       
        int fibN = fib(n-2)+fib(n-1);
       
        return fibN;
        
        
    }
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++)
        {
            System.out.println(fib(i));
        }
    }
}