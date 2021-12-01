package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

/*Write a function, pairProduct, that takes in an array and a target product as arguments.
 The function should return an array containing a pair of indices whose elements multiply to the given target.
  The indices returned must be unique.

Be sure to return the indices, not the elements themselves.

There is guaranteed to be one such pair whose product is the target.

test_00:
pairProduct([3, 2, 5, 4, 1], 8); // -> [1, 3]*/
public class pairProducts {
    public static void main(String[] args) {
        int [] arr =    getPairProducts(new int[]{4, 6, 8, 2, }, 16);

        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }


    static int [] getPairProducts(int [] arr, int target){

        HashMap<Double,Integer> characterIntegerHashMap = new HashMap<>();
        int [] res = new int[2];
        for (int i=0;i<arr.length;i++){

            if(!characterIntegerHashMap.containsKey(arr[i])){
                characterIntegerHashMap.put(Double.valueOf(arr[i]),i);
            }
            double complement = target / arr[i];
            if(characterIntegerHashMap.containsKey(complement)){
               res[0] =characterIntegerHashMap.get(complement);
               res[1]= i ;

            }

        }



        return res;


    }
}
