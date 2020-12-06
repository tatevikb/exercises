public class Palindrome {
    public static boolean isPalindrome(String str) {
        if(str.equals(reverse(str))) {
            return true;
        }
        return false;
    }

    public static String reverse(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String a = "abcddcba";
        String b = "";
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
    }
}
