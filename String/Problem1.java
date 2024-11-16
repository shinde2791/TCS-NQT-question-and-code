package String;

public class Problem1 {
    public static void main(String[] args) {
        String str1="jayesh";
        String str2="";

        for(int i=str1.length()-1;i>=0;i--){
              str2 +=str1.charAt(i);
        }

        if(str1.equals(str2)){
            System.out.println("string is palindrone");
        }else{
            System.out.println("String is not palindrone");
        }
    }
}
