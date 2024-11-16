import java.util.HashMap;


public class Problem10 {
    public static void main(String[] args) {
        String input="swiss";
        char result=findFirstNonRepeatingChar(input);

        if(result!='\0'){
            System.out.println("first non repeating element is " + result);
        }else{
            System.out.println("No non repeating element ");
        }

    }
    public static char findFirstNonRepeatingChar(String str){
        HashMap<Character,Integer>freqMap=new HashMap<>();
        for(char ch : str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        for(char ch : str.toCharArray()){
            if(freqMap.get(ch)==1){
                return ch;
            }
        }
        return '\0'; 
    }
}
