package Contest.Biweekly;

public class C134 {
    public static void main(String[] args) {
        int[] colors = {0, 0, 1, 0};
        System.out.println(numberOfAlternatingGroups(colors));
        int[] colorsII = {0, 1, 0, 0, 1, 0, 1};
        int k = 6;
        System.out.println(numberOfAlternatingGroupsII(colorsII, k));
    }

    private static int numberOfAlternatingGroups(int[] colors) {
        if (colors.length < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i < colors.length - 1; i++) {
            if ((colors[i] != colors[i - 1]) && (colors[i] != colors[i + 1])) {
                count++;
            }
        }

        if (colors[0] != colors[1] && colors[0] != colors[colors.length - 1]) {
            count++;
        }

        if (colors[colors.length - 1] != colors[colors.length - 2] && colors[colors.length - 1] != colors[0]) {
            count++;
        }
        return count;
    }

    private static int numberOfAlternatingGroupsII(int[] colors, int k) {
        if (colors.length < 3) {
            return 0;
        }
        int count = 0;
        int n = colors.length;
        for (int s = 0; s < n; s++) {
            int window = 1;
            for (int i = 1; i < k; i++) {
                int curr = (s + i) % n;
                int prev = (s + i - 1) % n;

                if (colors[curr] == colors[prev]) {
                    window = 1;
                    break;
                } else {
                    window++;
                }
            }
            if (window == k) {
                count++;
            }
        }
        return count;
    }
}
