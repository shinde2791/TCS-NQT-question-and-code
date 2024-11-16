//Find the second largest value in the array
public class Problem8 {
    public static void main(String[] args) {
        int arr[]={2,4,1,6,8,9};

        if(arr.length<2){
         System.out.println("the array should conatin atleast 2 element");
        }

        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                second=largest;
                largest=num;
            }else if(num>second && num<largest){
               second=num;
            }
            
        }
        
        if(second==largest){
            System.out.println("there is no second largest");
        }else{
            System.out.println("the second largest value in the array is " + second);
        }
    }
    
}
