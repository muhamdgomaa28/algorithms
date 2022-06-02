package ArraysAndStrings;

import java.util.List;

public class groupingDigits {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 0 };
        System.out.println(minswaps(arr, 5));

//        Input : Array = [0, 1, 0, 1, 0]
//        Output : 3

    }

    public static int minswaps(int arr[], int n)
    {
        int count = 0;
        int num_unplaced_zeros = 0;

        for (int index = n - 1; index >= 0; index--)
        {
            if (arr[index] == 0)
                num_unplaced_zeros += 1;
            else
                count += num_unplaced_zeros;
        }
        return count;
    }



    public static int minMoves(List<Integer> arr) {

        //Minimum number of adjacent swaps of binary array
        // Write your code here
//        Input : 0,1,0,1 (array with 0 based index)
//        Swaps needed : 0,1,0,1 -> 0,0,1,1 (1 swap from index 1 to index 2)
//
//        Solution : 1


        int n0 =0;
        int i0=0;
        int n1=0;
        int i1 =0;

        for(int p =0; p< arr.size();p++){

            if(arr.get(p) == 0){

                n0 += p - i0++;
            }else {

                n1 += p - i1++;
            }

        }
        return Math.min(n0 , n1);

    }

    /////////////////////////////

    public static int getMinimumUniqueSum(List<Integer> arr) {
        // Write your code here

        int n =arr.size();
        int sum =arr.get(0);
        int prev =arr.get(0);

        for(int i=1; i< n; i++){
            if(arr.get(i) <= prev){
                prev = prev +1;
                sum = sum + prev;

            } else {
                sum = sum + arr.get(i);
                prev = arr.get(i);

            }

        }
        return sum;

    }
}
