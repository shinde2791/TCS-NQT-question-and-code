public class Problem7 {
    public static void main(String[] args) {
        int arr[]={2,4,1,6,7,9};

        int n=arr.length;

        int largest=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    
}
