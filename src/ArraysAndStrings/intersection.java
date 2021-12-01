package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
* Write a function, intersection, that takes in two arrays, a,b, as arguments.
* The function should return a new array containing elements that are in both of the two arrays.

You may assume that each input array does not contain duplicate elements.

test_00:
intersection([4,2,1,6], [3,6,9,2,10]) // -> [2,6]*/
public class intersection {

    public static void main(String[] args) {
        ArrayList arr =    getIntersection(new int[]{0,1,2}, new int[]{7,8});

       arr.stream().forEach(i -> System.out.println(i));

    }

    static ArrayList getIntersection(int arr[] , int [] arr2) {
        HashSet<Integer> integers = new HashSet<>();
        ArrayList  arrayList = new ArrayList();
        int count = 0;
        for(int i=0;i<arr.length; i++){
            integers.add(arr[i]);

        }
        for(int i =0;i<arr2.length; i++){
            if(integers.contains(arr2[i])){
            arrayList.add(arr[i]);

            }

        }
        return  arrayList;
    }
}
