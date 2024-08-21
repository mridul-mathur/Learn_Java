package Leetcode.Array_String;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }

    private static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            sb.append(chars[i]);
            while ((i + 1 < chars.length) && (chars[i + 1] == chars[i])) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
        }
        char[] ch = sb.toString().toCharArray();
        System.arraycopy(ch, 0, chars, 0, ch.length);
        return ch.length;
    }
}
