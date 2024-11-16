import java.util.Arrays;


public class Problem19 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;

        int newElement=6;

        int newArr[]=new int[arr.length+1];

        for(int i=0;i<n;i++){
            newArr[i]=arr[i];
        }

        newArr[arr.length]=newElement;

       System.out.println("array after adding new element " + Arrays.toString(newArr));
    }
    
}
