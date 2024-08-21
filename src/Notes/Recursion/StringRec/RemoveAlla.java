package Notes.Recursion.StringRec;

public class RemoveAlla {
    public static void main(String[] args) {
        String str = "baccad";
        removea1("", str);
        String str1 = "baacdabd";
        System.out.println(removea2(str1));
    }

    private static void removea1(String p, String str) {
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = str.charAt(0);

        if (ch == 'a') {
            removea1(p, str.substring(1));
        } else {
            removea1(p + ch, str.substring(1));
        }
    }

    private static String removea2(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char cha = str.charAt(0);

        if (cha == 'a') {
            return removea2(str.substring(1));
        } else {
            return cha + removea2(str.substring(1));
        }
    }
}
