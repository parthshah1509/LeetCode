//StrangeSorting

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class strangeSorting {
    public static void main(String[] args) {
        int[] mapping = {3,5,4,6,2,7,9,8,0,1};
        int[] nums = {990,332,32};
        String[] result = strangeSort(mapping,nums);
    }



    private static String[] strangeSort(int[] mapping, int[] nums){
        System.out.println(Arrays.toString(nums));
        String[] result = new String[nums.length];
        int[] res = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < mapping.length; i++){
            map.put(mapping[i],i);
        }
        Map<Integer,Integer> map2 = new HashMap<>();
        System.out.println(map.toString());
        int i = 0;
        for (int number : nums){
            System.out.print(number + " = ");
            int converted = 0;
            while(number != 0){
                int r = number % 10;
                number /= 10;
                converted = converted * 10 + map.get(r);

            }
            System.out.println(converted);
            res[i] = reverse(converted);
            map2.put(res[i],nums[i]);
            i++;
        }
        System.out.println(Arrays.toString(res));
        int[] res2 = res.clone();
        Arrays.sort(res2);
        for(int j = 0; j < res2.length; j++){
            res[j] = map2.get(res2[j]);
        }
        System.out.println(map2.toString());
        System.out.println(Arrays.toString(res));
        return result;
    }

    private static int reverse(int num){
        int reversed=0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

}
