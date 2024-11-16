//find the second smallest value in an array

public class Problem9 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 4, 6, 8 };
        if (arr.length < 2) {
            System.out.println("Array should conatin atleat 2 element");
        }

        int largest = Integer.MAX_VALUE;
        int Second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < largest) {
                Second = largest;
                largest = num;
            } else if (num > Second && num < largest) {
                Second = num;
            }
        }
        if (Second == Integer.MAX_VALUE) {
            System.out.println("you not having value");
        } else {
            System.out.println("second is " + Second);
        }
    }
}
