// count the frequency in an array 

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr []={1,2,3,2,1,2};
        int n=arr.length;
        int count =0;        
        int target =sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count ++;
            }
           
        }
        System.out.println("the target frequency " + target );
        System.out.println("count is " + count );
    }
    
}
