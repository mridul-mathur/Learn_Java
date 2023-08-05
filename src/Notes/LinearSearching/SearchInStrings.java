package Notes.LinearSearching;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Mridul Mathur";
        char target = 'l';
        System.out.println(charsearch(name, target));
    }

    private static int charsearch(String name, char target) {
        if (name.length() == 0) {
            return -1;
        } else {
            for (int i = 0; i < name.length() - 1; i++) {
                if (name.charAt(i) == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}
