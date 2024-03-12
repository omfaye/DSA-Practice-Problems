//amazon 
public class reverseVowels {

    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char array[] = s.toCharArray();

        while (start < end) {
            if (!(array[start] == 'a' || array[start] == 'e' || array[start] == 'i' || array[start] == 'o'
                    || array[start] == 'u' || array[start] == 'A' || array[start] == 'E' || array[start] == 'I'
                    || array[start] == 'O' || array[start] == 'U')) {
                start++;
            } else if (!(array[end] == 'a' || array[end] == 'e' || array[end] == 'i' || array[end] == 'o'
                    || array[end] == 'u' || array[end] == 'A' || array[end] == 'E' || array[end] == 'I'
                    || array[end] == 'O' || array[end] == 'U')) {
                end--;
            } else {
                char temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }

        }

        return String.valueOf(array);
    }

    public static void main(String args[]) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

}
