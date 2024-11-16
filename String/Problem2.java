package String;

public class Problem2 {
    public static void main(String[] args) {
        String str="Hello World! This is Java.";
         
        int vowel=0;
        int consonantCount =0;
        int spaceCount =0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch==' '){
                spaceCount++;
            }else if(ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else if(ch>='a' && ch <='z'){
                consonantCount++;
            }
        }
        System.out.println("vowel" + vowel);
        System.out.println("consonantCount" + consonantCount);
        System.out.println("spacecount" + spaceCount);
    }
}
