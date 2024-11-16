public class Peoblem17 {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4};
        int n=arr.length;
        int arr1[]=new int[n];
        int k=0;

        for(int i=0;i<n;i++){
            boolean isDuplicate=false;
            for(int j=0;j<k;j++){
                if(arr[i]==arr1[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                arr1[k++]=arr[i];
            }
            
        }
        for(int i=0;i<k;i++){
            System.out.println(arr1[i]);
        } 
    }
    
}
