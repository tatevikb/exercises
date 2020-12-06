public class ReversString {
    public static String revers(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }
        String revers = "";
        for(int i = str.length() - 1 ; i >= 0; i--) {
            revers = revers + str.charAt(i);
        }
        return revers;
    }
    public static String rev(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }
        byte[] s = str.getBytes();
        byte[] result = new byte[s.length];
        for(int i = 0; i < s.length; i++) {
            result[i] = s[s.length - i - 1];
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String str = "afjhgekjhg";
        System.out.println(revers(str));
        System.out.println(rev(str));
    }
}
