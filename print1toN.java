public class print1toN {
    public static void main(String[] args) {
        int n = 5;
        printBoth(n);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);

    }

    static void printBoth(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);

    }
}
