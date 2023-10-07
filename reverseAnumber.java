public class reverseAnumber {
    public static void main(String[] args) {
        int n = 198;
        reverse1(n);
        System.out.println(sum);
    }

    static int sum = 0;

    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n / 10);
    }

}
