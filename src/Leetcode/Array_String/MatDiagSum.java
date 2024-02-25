package Leetcode.Array_String;

//1572. Matrix Diagonal Sum

public class MatDiagSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(mat));
    }

    private static int diagonalSum(int[][] mat) {
        int sum = 0;
        if (mat.length % 2 != 0) {
            sum -= mat[(mat.length) / 2][(mat.length) / 2];
        }
        int i = 0;
        int j = 0;
        while (i < mat.length && j < mat[i].length) {
            sum += mat[i][j];
            i++;
            j++;
        }
        i = 0;
        j--;
        while (i < mat.length && j >= 0) {
            sum += mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}
