//FindTheRank

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class findTheRank {
    public static void main(String[] args) {
        int[][] marks = {{79,89,15,15},
                {85,89,92,92},
                {71,96,88,88},
                {71,96,88,88}};
        int rank  = 2;
        System.out.println(findRank(marks,rank));
    }

    private static int findRank(int[][] performance, int rank){
        int index = -1;
        int[] sum = new int[performance.length];
        for(int i = 0; i < performance.length; i++){
            for (int j = 0; j < performance[i].length; j++){
                sum[i]+=performance[i][j];
            }
        }
        System.out.println(Arrays.toString(sum));
        int[] sum2 = sum.clone();
//        Collections.sort(Arrays.asList(sum2));
        Arrays.sort(sum2);
        System.out.println(Arrays.toString(sum2));
        int rankScore = sum2[sum2.length-rank];
        System.out.println(sum2[sum2.length-rank]);
        System.out.println();
        for (int i = 0; i < sum.length; i++){
            if(sum[i] == rankScore)
                return i;
        }
        return -1;
    }
}
