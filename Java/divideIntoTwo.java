// 3. Divide Array into two with equal size, make sure every element in each two array is unique. return empty list if impossible.
// First sort and then redistribution, more than 2 consecutively, can not be satisfied
// I am a HashMap record the number of occurrences of each number of the original array. If there is more than 2, it is impossible to meet the requirement and return directly to the space. If the number of occurrences is 2 or less, it will be divided equally into two. Array, the only thing that happens to be divided into two arrays is as long as the length of the last two arrays is the same.

public static List<List<Integer>> divideIntoTwo(int[] arr){
    int len = arr.length;
    HashMap<Integer,Integer> count = new HashMap<>();
    List<Integer> first = new ArrayList<>();
    List<Integer> second = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    ans.add(first);
    ans.add(second);

    for(int i : arr)
        count.put(i,count.getOrDefault(i,0)+1);
    boolean flag = true;
    for (HashMap.Entry<Integer, Integer> entry : count.entrySet()) {
        if(entry.getValue() > 2)
            return new ArrayList<>();
        else if (entry.getValue() == 1)
            if(flag) {
                first.add(entry.getKey());
                flag = false;
            }
            else {
                second.add(entry.getKey());
                flag = true;
            }
        else {
            first.add(entry.getKey());
            second.add(entry.getKey());
        }
    }

    return ans;
}