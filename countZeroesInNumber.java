public class countZeroesInNumber {
    public static void main(String[] args) {
        int n = 100;
        int ans = countZero(n);
        System.out.println(ans);
    }

    static int count = 0;

    static int countZero(int n) {
        if (n == 0) {
            return count;
        }

        int rem = n % 10;
        if (rem == 0) {
            count++;
        }

        return countZero(n / 10);
    }
}
