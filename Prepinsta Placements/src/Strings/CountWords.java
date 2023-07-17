package Strings;

public class CountWords {
    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                count++;
            }

        }
        count++;
        return count;
    }

    public static void main(String[] args) {
        String str = "abhishek raj";
        int ans = countWords(str);
        System.out.println(ans);

    }
}
