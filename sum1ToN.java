public class sum1ToN {
    public static void main(String[] args) {
        int n = 10;
        int sum = SUM(n);
        System.out.println(sum);
    }

    static int SUM(int n) {

        if (n <= 1) {
            return 1;
        }
        return n + SUM(n - 1);
    }
}
