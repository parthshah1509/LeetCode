//Tom and Jerry

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TomJerry {
    public static void main(String[] args) {

    }

    private static int play(List<List<Integer>> arr){
        if(arr.size() == 0)
            return 0;
//        if(arr.size()== 1)
//            return arr.get(0).get(0);
        int diff = 0;
        ArrayList<Integer> scores = new ArrayList<>();
        for(int j = 0; j < arr.get(0).size(); j++){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < arr.size(); i++){
                max = Math.max(max, arr.get(i).get(j));
            }
            scores.add(max);
        }

        Collections.sort(scores);

        for(int i = scores.size()-1; i>=0; i--){
            if(i%2 == 0)
                diff += scores.get(i);
            else
                diff -= scores.get(i);
        }
        return Math.abs(diff);
    }
}
