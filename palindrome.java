public class palindrome {
    public static void main(String[] args) {
        int n = 99;
        System.out.println(palindromeNumber(n));
    }

    static boolean palindromeNumber(int n) {
        return n == reverse1(n);
    }

    static int sum = 0;

    static int reverse1(int n) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse1(n / 10);
    }
}
