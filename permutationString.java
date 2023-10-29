import java.util.ArrayList;

public class permutationString {
    public static void main(String[] args) {
        System.out.println(permutation("", "abc"));
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String subStr1 = p.substring(0, i);
            String subStr2 = p.substring(i, p.length());
            permutations(subStr1 + ch + subStr2, up.substring(1));
        }
    }

    static ArrayList<String> permutation(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String subStr1 = p.substring(0, i);
            String subStr2 = p.substring(i, p.length());
            ans.addAll(permutation(subStr1 + ch + subStr2, up.substring(1)));
        }
        return ans;
    }
}
