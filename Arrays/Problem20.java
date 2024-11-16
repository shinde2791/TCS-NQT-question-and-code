import java.util.HashMap;
import java.util.Map;


public class Problem20 {
    public static void main(String[] args) {
        int arr[]={4,2,4,5,2,3,1};
        
        HashMap<Integer,Integer>elementCount=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(elementCount.containsKey(arr[i])){
                elementCount.put(arr[i], elementCount.get(arr[i])+1);
            }else{
                elementCount.put(arr[i], 1);
            }
        }

        System.out.println("reapeating element in the array are");

        for(Map.Entry<Integer,Integer>entry:elementCount.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
    
}
