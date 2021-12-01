package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

/*
Write a function, pairSum, that takes in an array and a target sum as arguments.
 The function should return an array containing a pair of indices whose elements sum to the given target.
 The indices returned must be unique.
Be sure to return the indices, not the elements themselves.
There is guaranteed to be one such pair that sums to the target.
*/
public class pairSum {

    // brute force algorithm
    //
    public static void main(String[] args) {
    int [] arr =    getPairSumAnotherSoulotion(new int[]{6, 4, 2, 8}, 12);

        Arrays.stream(arr).forEach(i -> System.out.println(i));

    }
// we calculate space based on declaration inputs
    static int [] getPairSum(int [] arr, int target) {
        int [] res =new int [2];
        for(int i = 0; i< arr.length;i++) {
            for(int j = i + 1; j < arr.length;j++ ){
                if(arr[i] + arr[j] == target) {
               res[0]=i;
               res[1]=j;
                }
            }

        }
        return res;
    }

    // 2,8,7,4   =>10
    static int [] getPairSumAnotherSoulotion(int [] arr, int target) { // o(n)
        HashMap<Integer,Integer> integerIntegerHashMap = new HashMap<>();
        int [] res =new int [2];
        for(int i = 0; i< arr.length;i++) {
            if(!integerIntegerHashMap.containsKey(arr[i])){
                integerIntegerHashMap.put(arr[i],i);
            }
            int complement = target - arr[i];
            if(integerIntegerHashMap.containsKey(complement)) {
               res[0]=integerIntegerHashMap.get(complement);
               res[1]=i;

            }

            }


        return res;
    }

}
