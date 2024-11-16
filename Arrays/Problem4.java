//find the majority element in an array 
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
 
        int candidate=arr[0];
        int count =1;

        for(int i=1;i<n;i++){
            if(arr[i]==candidate){
                count++;
            }else{
                count --;
            }
            if(count == 0){
                candidate=arr[i];
                count=1;
            }
        }
        count =0;
        for(int i=0;i<n;i++){
            if(arr[i]==candidate){
                count ++;
            }
        }
        if(count >n/2){
            System.out.println("majority element is " + candidate);
        }else{
            System.out.println("not majority is been present ");
        }
    }
    
}
