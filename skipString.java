public class skipString {
    public static void main(String[] args) {
        String a = "applbacaxafartt";
        System.out.println(skip(a));
        System.out.println(skipApp(a));

    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        if (up.startsWith("apple")) {
            return skip(up.substring(5));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }

    static String skipApp(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skip(up.substring(3));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }

}
