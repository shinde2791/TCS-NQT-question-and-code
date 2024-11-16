import java.util.HashMap;
public class Problem9 {
    public static void main(String[] args) {
        String input="hello world";
        HashMap<Character,Integer>freqMap=new HashMap<>();

        for(char ch:input.toCharArray()){
            if (ch != ' ') { // Ignore spaces
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }
        for(char key:freqMap.keySet()){
            System.out.println(key + " frequency " + freqMap.get(key));
        }

    }
}
