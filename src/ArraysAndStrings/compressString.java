package ArraysAndStrings;

public class compressString {
    // input :aaatttt
    //output: 3a4t
    public static void main(String[] args) {

        System.out.println(compress("tttkko"));
    }

    public static String compress(String s) {
// two pointers
        int j = 0;
        int i = 0;
        String res = "";
        while (j < s.length()) {
            //j++;
            if (s.charAt(i) == s.charAt(j)) {
                j++;
                if (j == s.length()) {
                    int count = j - i;
                    res = getResult(s, i, res, count);
                }

            } else {
                int count = j - i;
                res = getResult(s, i, res, count);
                i = j;

            }


        }


        return res;
    }

    static String getResult(String s, int i, String res, int count) {
        if (count > 1) {
            res += (count + String.valueOf(s.charAt(i)));

        } else {
            res += String.valueOf(s.charAt(i));

        }
        return res;
    }
}

