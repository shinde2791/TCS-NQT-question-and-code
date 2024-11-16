//find the smallest number in an array

public class Problem5 {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,6,7};

        int n=arr.length;
         
        int smallest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
           
        }
        System.out.println(smallest);

    }
    
}
