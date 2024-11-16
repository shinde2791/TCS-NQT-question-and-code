////sort an element in an array using bubble sort

public class Problem3 {
    public static void main(String[] args) {
        int arr[]={2,3,1,6,4,8,7};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
           
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
