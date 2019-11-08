//Give an array and find the count of a pair number and a single number combination in a row of this array.

public static int countGoodTuple(int[] input){
    int count = 0;

    if(input.length < 3)
        return 0;

    for(int i = 1; i < input.length-1; i++){
        if(input[i-1] == input[i] || input[i] == input[i+1] || input[i-1] == input[i+1])
            count+=1;
    }

    return count;
}