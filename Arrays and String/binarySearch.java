public class binarySearch {

    public static int get_num(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;
        int flag = 0;
        while (start <= end) {

            mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 9;
        System.out.println("Key is at " + get_num(array, key));
    }
}
