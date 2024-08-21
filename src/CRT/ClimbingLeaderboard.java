package CRT;

import java.util.Arrays;

public class ClimbingLeaderboard {
    public static void main(String[] args) {
        int []  ranked = {100,90,90,80};
        int [] player ={70,80,105};
        System.out.println(Arrays.toString(climbingLeaderboard(ranked,player)));
    }

    public static int[] climbingLeaderboard(int[] ranked, int[] player){
        int count =0;
        int [] m = new int[player.length];
        for (int j = 0; j < player.length; j++) {
            for (int i = ranked.length; i < 0 ; i--) {
                if (player[i]== ranked[ranked.length-1 -i]){
                    m[j] = i + count;
                    count++;
                    break;
                } else if (player[i] > ranked[ranked.length-1 -i]) {
                    continue;
                }else {
                    m[j] = i +count;

                }
            }
        }
        return m;
    }
}
