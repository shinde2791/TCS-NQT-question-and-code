package String;

public class Problem5 {
    public static void main(String[] args) {
        String str="Hello World! 123 Java@2024";

        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isAlphabetic(ch)){
                result.append(ch);
            }
        }
        System.out.println(result);

    }
}
