public class subarrays {
    public static void subarrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= j; k++) {
                    System.out.print("(" + arr[k] + ")" + "");
                }
                System.out.println();

            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        subarrays(arr);
    }
}
