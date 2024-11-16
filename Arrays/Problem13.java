// write a code to convert array in decreasing form 

public class Problem13 {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        


        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
         
        }
        for(int i=0;i<n;i++){
            System.out.print( arr[i] + " ");
         }
    }
}
