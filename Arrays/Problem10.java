//find the missing number in array 

public class Problem10 {
    public static void main(String[] args) {
        int arr[] = { 1,2,4,5,6,7};
        int n = arr.length + 1;

        int totalSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }
        int missingNumber = totalSum - actualSum;

        System.out.println("the missing number is : " + missingNumber);
    }
}
