//search an element in an array using Linary search

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr []={2,4,1,5,7,1};
        int n=arr.length;
        int search =sc.nextInt();
        boolean result=false;
        

        for(int i=0;i<n;i++){
            if(arr[i]==search){
                System.out.println("your element found at " + i + " index");
            }
        }
    if(result =false){
        System.out.println("your element is not present in the list");
    }
    }
    
}
