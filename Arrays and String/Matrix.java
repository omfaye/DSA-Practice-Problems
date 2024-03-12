import java.util.*;
public class Matrix {
    public static boolean search(int matrix[][], int  key)
    {   
        int n = matrix.length;
        int m = matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.print("Found at " +i+""+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int matrix[][] = new int[3][3];
        int n=3;
        int m = 3;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
            
        }
        search(matrix, 5);

    }
}

