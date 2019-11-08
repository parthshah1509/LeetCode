// 5. most Frequent Digits
// The most frequently occurring number
// Input: A = [22, 2, 3, 33, 5]
// Output: [2, 3]
// At first, there was a case that could not pass, and then re-initialized the dictionary, which may be A=[].

public static int[] mostFrequent(int[] a){
    ArrayList<Integer> res = new ArrayList<>();
    HashMap<Integer,Integer> count = new HashMap<>();

    for (int num : a){
        while (num > 0){
            int digit = num%10;
            count.put(digit,count.getOrDefault(digit,0)+1);
            num /= 10;
        }
    }
    System.out.println(count.toString());
    int max = Integer.MIN_VALUE;
    for (HashMap.Entry<Integer,Integer> entry : count.entrySet()){
        if(entry.getValue() > max){
            max = entry.getValue();
            res.clear();
            res.add(entry.getKey());
        }
        else if(entry.getValue() == max)
            res.add(entry.getKey());
    }

    int[] r = new int[res.size()];
    for(int i = 0; i < res.size(); i++) {
        if (res.get(i) != null) {
            r[i] = res.get(i);
            System.out.print(res.get(i) + " ");
        }
    }
    return r;

}