import java.util.HashSet;

public class Problem18 {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 4, 3, 5, 6, 7, 5 };
        int n = arr.length;

        HashSet<Integer> uniqueElement = new HashSet<>();

        for (int i = 0; i < n; i++) {
            uniqueElement.add(arr[i]);
        }

        for (int element : uniqueElement) {
            System.out.println(element);
        }

    }
}
