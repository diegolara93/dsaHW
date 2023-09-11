public class Diego_Lara_hw4 {
    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int original = num;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
                    return original == reverse;

        }
    public static int maxPalindrome() {
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) { // j = i because we don't want to repeat the same numbers
                int product = i * j;
                if (isPalindrome(product) && product > max) {
                    max = product;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxPalindrome());
    }
}

