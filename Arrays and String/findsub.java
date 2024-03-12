
class findsub {
    public static void findsubstr(String str, String ans, int index) {
        if (index == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");

            } else {
                System.out.println(ans);
            }
            System.out.println("");
            return;
        }
        findsubstr(str, ans + str.charAt(index), index + 1);
        findsubstr(str, ans, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findsubstr(str, "", 0);
    }
}