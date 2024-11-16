//find a average of all the element in array

public class Probelm15 {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,6};
        int n=arr.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        double average=(double)sum/n;

        System.out.println(average);
    }
    
}
