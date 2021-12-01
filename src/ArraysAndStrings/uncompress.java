package ArraysAndStrings;
/*Write a function, uncompress, that takes in a string as an argument.
 The input string will be formatted into multiple groups according to the following pattern:
<number><char>
for example, '2c' or '3a'.
The function should return an uncompressed version of the string where each 'char' of a group is repeated 'number' times consecutively.
You may assume that the input string is well-formed according to the previously mentioned pattern.
test_00:
uncompress("2c3a1t"); // -> "ccaaat"

*/
public class uncompress {
    public static void main(String[] args) {


        System.out.println(uncompress("2v5b"));


    }
    public  static String uncompress(String s){
        String res = "";
        String numbers="0123456789";
        int i=0;
        int j =0; // "20c10m"
        while(j < s.length()){
            if(numbers.contains(String.valueOf(s.charAt(j)))) // check not char
            {
                j+=1;
            } else{
                int num = Integer.parseInt((s.substring(i,j))); //cast to int and substring

                for(int x=0; x< num;x++){
                    res +=s.charAt(j);
                }
                j+=1;
                i =j;
            }
            }
        return res;

    }
}
