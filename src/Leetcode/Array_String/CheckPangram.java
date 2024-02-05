package Leetcode.Array_String;


//1832. Check if the Sentence Is Pangram
public class CheckPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    private static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        char ch = 'a';
        int i = 0;
        while (i < 26) {
            if (sentence.contains(String.valueOf(ch))) {
                ch++;
            } else {
                return false;
            }
            i++;
        }
        return true;
    }
}
