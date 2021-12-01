package ArraysAndStrings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagrams("asd","dsa"));

    }

    static boolean isAnagrams(String s1, String s2) {
        boolean status = false;

        if(s1.length() != s2.length()){
            status = false;

        } else {

            char [] s1charArray = s1.toLowerCase().toCharArray();
            char [] s2charArray = s2.toLowerCase().toCharArray();
            Arrays.sort(s1charArray);
            Arrays.sort(s2charArray);

            if(Arrays.equals(s1charArray, s2charArray)){

                status = true;
            }


        }

        return status;


    }
}
