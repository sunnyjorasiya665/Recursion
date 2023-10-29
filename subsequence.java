import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        // subseq("", "abcd");
        System.out.println(subsequ("", "abcd"));
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));

    }

    static ArrayList<String> subsequ(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequ(p + ch, up.substring(1));
        ArrayList<String> right = subsequ(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
