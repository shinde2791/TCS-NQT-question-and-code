
import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem11 {
    public static void main(String[] args) {
        String str1="eshjay";
        String str2="jayesh";

        boolean result=areAnagram(str1,str2);
        if (result) {
            System.out.println("String is anagram");
        } else {
            System.out.println("String is not anagram");
        }
    }
    public static boolean areAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char [] CharArray1=str1.toCharArray();
        char [] CharArray2=str2.toCharArray();

        Arrays.sort(CharArray1);
        Arrays.sort(CharArray2);

        return Arrays.equals(CharArray1, CharArray2);

    }
}
