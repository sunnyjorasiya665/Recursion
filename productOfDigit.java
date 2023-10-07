public class productOfDigit {
    public static void main(String[] args) {
        int n = 98;
        int ans = product(n);
        System.out.println(ans);
    }

    static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}
