public class spiralMatrix {
    public static void spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;
        while (top <= bottom && left<=right) {
            // top
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }

            // right
            for (int i = left + 1; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            // bottom
            
            for (int i = right - 1; i >= left; i--) {
                if(top==bottom)
                {
                    break;
                }
                System.out.print(matrix[bottom][i] + " ");
            }  
            
            // left
            for (int i = bottom - 1; i >= top + 1; i--) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;
            right--;
            top++;
            bottom--;
        }
       
    }
    public static void main(String args[])
    {
        int matrix[][] = { { 1, 2, 3, 4 },{5,6,7,8} , {9,10,11,12}  };
        spiralOrder(matrix);
    }
}