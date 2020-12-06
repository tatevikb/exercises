public class IntPalindrome {
    public static boolean isPalindrome(int n) {
        int p = n;
        int reverse = 0;

        while (p != 0) {
            int reminder = p % 10;
            reverse = reverse * 10 + reminder;
            p = p / 10;
        }
        if(n == reverse) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 123321;
        int b = 3257;
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
    }
}
