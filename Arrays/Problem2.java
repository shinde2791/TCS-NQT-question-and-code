//search an element in an array using binary search

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={12,14,15,34,45,55,57,61,66,78,99};
        int low=0;
        int high=arr.length-1;
        int search = sc.nextInt();
        boolean result=true;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(search==arr[mid]){
                System.out.println("your element is present in the arr " +  mid);
                result=true;
                break;
            }

            if(search<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(result=false){
            System.out.println("your element is not present in the list");
        }
    }
    
}
