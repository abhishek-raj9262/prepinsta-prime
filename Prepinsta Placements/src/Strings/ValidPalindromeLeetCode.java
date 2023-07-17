package Strings;

public class ValidPalindromeLeetCode {
    public static String removeNonAlphaNumeric(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return  str;
    }
    public static String convertToLowerCase(String str){
        str = str.toLowerCase();
        return str;
    }
    public static boolean isPalindrome(String s) {
        String ans = removeNonAlphaNumeric(s);
        String ans1 = convertToLowerCase(ans);
        for (int i = 0; i < ans1.length(); i++) {
            if(ans1.charAt(i) != ans1.charAt(ans1.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }
}

