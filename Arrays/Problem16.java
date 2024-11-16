//find the meadian of an array 
import java.util.Arrays;
public class Problem16 {
    public static void main(String[] args) {
        int arr []={3,2,1,4,5,7};
        int n=arr.length;
        
        Arrays.sort(arr);
        double meadian;

        if(n%2==1){
            meadian=arr[n/2];
        }else{
            meadian=(arr[(n/2)-1] + arr[n/2])/2.0;
        }

        System.out.println(meadian);


    }
    
}
