package Leetcode.Array_String;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] t = transpose(matrix);
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] matrix) {
        int i = matrix.length;
        int j = matrix[0].length;
        int[][] t = new int[j][i];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                t[l][k] = matrix[k][l];
            }
        }
        return t;
    }
}
