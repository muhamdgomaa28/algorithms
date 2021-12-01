package ArraysAndStrings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*Write a function, mostFrequentChar, that takes in a string as an argument.
 The function should return the most frequent character of the string.
 If there are ties, return the character that appears earlier in the string.

You can assume that the input string is non-empt*/
public class mostFrequestChar {
    public static void main(String[] args) {

        System.out.println(getMostfrequentChar("riverbed"));


    }

    static Character getMostfrequentChar(String s){
        HashMap<Character, Integer> characterIntegerHashMap= new HashMap<>();
        TreeMap<Integer, Character> treemap =
                new TreeMap<>(Collections.reverseOrder());

        for(int i=0; i< s.length(); i++) {
            if(characterIntegerHashMap.containsKey(s.charAt(i))) {
                characterIntegerHashMap.put(s.charAt(i),characterIntegerHashMap.get(s.charAt(i)) + 1);
            } else {
                characterIntegerHashMap.put(s.charAt(i),1);
            }
        }

        for(Map.Entry<Character, Integer> entry : characterIntegerHashMap.entrySet()){
            if(!treemap.containsKey(entry.getValue())){ // i put this check to get first occurence in case to equal chars
                treemap.put(entry.getValue(),entry.getKey());
            }
        }

        return treemap.firstEntry().getValue();

    }
}
