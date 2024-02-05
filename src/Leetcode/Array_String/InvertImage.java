package Leetcode.Array_String;

import java.util.Arrays;

public class InvertImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        flipAndInvertImage(image);
        FLIPaNDiNVERTiMAGE(image);
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
    }

    private static int[][] FLIPaNDiNVERTiMAGE(int[][] image) {
        int i =0;
        while (i<image.length){
            for (int j = 0; j < image[i].length - j; j++) {
                swap(image,i,j);
            }
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j]==0){
                    image[i][j]=1;
                }else {
                    image[i][j]=0;
                }
            }
            i++;
        }
        return image;
    }

    private static void flipAndInvertImage(int[][] image) {
        int i = 0;
        int j = 0;
        flip(image, i, j);
        invert(image,0,0);
    }

    private static void invert(int[][] image, int i, int j) {
        if(i<image.length){
            if(j< image[i].length){
                if (image[i][j]==0){
                    image[i][j]=1;
                }else {
                    image[i][j]=0;
                }
                invert(image,i,j+1);
            }else {
                invert(image, i+1, 0);
            }
        }
    }

    private static void flip(int[][] image, int i, int j) {
        if (i < image.length) {
            if (j < image[i].length - j) {
                swap(image, i, j);
                flip(image, i, j + 1);
            } else {
                flip(image, i + 1, 0);
            }
        }
    }

    private static void swap(int[][] image, int i, int j) {
        if (j == image[i].length - 1 - j) {
            return;
        } else {
            int temp = image[i][j];
            image[i][j] = image[i][image[i].length - 1 - j];
            image[i][image[i].length - 1 - j] = temp;
        }
    }
}
