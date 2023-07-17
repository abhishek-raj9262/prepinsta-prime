package Strings;

public class ValidPalindrome {
    static String removeNonAlphaNumeric(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        return  str;
    }
    static String convertToLowerCase(String str){
        str = str.toLowerCase();
        return str;
    }
    static  boolean isPalindrome(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String ans = removeNonAlphaNumeric(s);
        String ans1 = convertToLowerCase(ans);
        boolean ans2 = isPalindrome(ans1);
        System.out.println(ans2);


    }
}
