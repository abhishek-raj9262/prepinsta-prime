package Strings;

public class ReverseString {
    static void printReverse(String str) {
        int end = str.length() - 1;
        String reverse = "";
        for (int i = end; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);


    }


    public static void main(String[] args) {
        String str = "abcde";
        printReverse(str);


    }
}
