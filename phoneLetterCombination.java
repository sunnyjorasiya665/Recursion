import java.util.ArrayList;

public class phoneLetterCombination {
    public static void main(String[] args) {
        // System.out.println(pad("", "12"));
        pad("", "12");
        System.out.println(padRet("", "23"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            pad(p + ch, up.substring(1));
        }

    }

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            ans.addAll(padRet(p + ch, up.substring(1)));
        }
        return ans;
    }
}
