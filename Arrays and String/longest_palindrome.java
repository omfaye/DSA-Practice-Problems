public class longest_palindrome {
    public static boolean checkPalindrome(String newstr) {
        int i = 0;
        int j = newstr.length() - 1;
        while (i < j) {
            if (newstr.charAt(i) == newstr.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        int max = -999;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String newstr = "";
            for (int j = i; j < s.length(); j++) {
                newstr += s.charAt(j);
                if (checkPalindrome(newstr)) {
                    if (max < newstr.length()) {
                        max = newstr.length();
                        result = newstr;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String args[]) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}
//it takes to time so we get the time limit excced in leetcode it takes O(n2) complexity it create many string takes more tham memory we think