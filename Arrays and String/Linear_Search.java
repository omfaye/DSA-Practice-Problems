//time complexity is determined O(n) worst case
import java.util.*;
public class Linear_Search {
    public static int linear_search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the key element:");
        int k = sc.nextInt();
        
        int index = linear_search(array, k);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Found at index : " + index);
        }
    }
}
