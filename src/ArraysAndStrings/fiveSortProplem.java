package ArraysAndStrings;

import java.util.Arrays;

//fiveSort([12, 5, 1, 5, 12, 7]);
//// -> [12, 7, 1, 12, 5, 5]
public class fiveSortProplem {
    public static void main(String[] args) {

       Arrays.stream(fiveSort(new int[]{1,5,5,7,6,5,5})).forEach(i -> System.out.println(i));

    }
// two pointer begining and end and check every time
    static int [] fiveSort(int [] arr){

        int i =0;
        int j = arr.length - 1;

        while (i < j) {
            if(arr[j] == 5){
                j--;
            }else if(arr[i] !=5){

                i++;
            }else{
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;

            }


        }


        return arr;




    }
}
