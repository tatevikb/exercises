public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int[] numbers = new int[countDigits(n)];
        int addCubes = 0;
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = cube(n % 10);
            n = (n - n % 10) / 10;
            addCubes += numbers[i];
        }
        if(addCubes == n) {
            return true;
        }
        return false;
    }
    public static int countDigits(int n) {
        int num = n;
        int count = 0;
        while(num != 0) {
            int reminder = num % 10;
            num = (num - reminder) / 10;
            count++;
        }
        return count;
    }
    public static int cube(int a) {
        return a * a * a;
    }

    public static void main(String[] args) {
        int a = 153;
        int b = 4234;
        System.out.println(isArmstrong(a));
        System.out.println(isArmstrong(b));
    }
}
