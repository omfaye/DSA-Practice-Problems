//not optimized code time complixity of this code O(n^2)
public class diagonalSum {
    public static int diagonal(int matrix[][])
    {   
        int sum1=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j)
                {
                    sum1+=matrix[i][j];
                }

                if(i+j==matrix.length-1)
                {
                    sum1+=matrix[i][j];
                }
            }
        }
        return sum1;
    }
    public static void main(String args[])
    {
        int matrix[][] = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16} };
        System.out.println(diagonal(matrix));
    }
}
