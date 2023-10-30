import java.util.ArrayList;

public class possibleLetters {

    public static void main(String[] args) {
        int[] a = { 2, 3 };
        System.out.println(possibleWords(a, 2));
    }

    static String[] keypad = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static ArrayList<String> possibleWords(int a[], int N) {
        ArrayList<String> result = new ArrayList<>();
        generateWords(a, N, 0, "", result);
        return result;
    }

    static void generateWords(int a[], int N, int index, String current, ArrayList<String> result) {
        if (index == N) {
            result.add(current);
            return;
        }

        int digit = a[index];
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            generateWords(a, N, index + 1, current + letters.charAt(i), result);
        }
    }
}
