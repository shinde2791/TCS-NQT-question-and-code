//find symmetric pairs in array

public class Problem21 {
    public static void findSymmetricPairs(int[][] pairs) {

        for (int i = 0; i < pairs.length; i++) {
            int a = pairs[i][0];
            int b = pairs[i][1];
            for (int j = i + 1; j < pairs.length; j++) {
                int c = pairs[j][0];
                int d = pairs[j][1];

                if (a == d && b == c) {
                    System.out.println("(" + a + " , " + b + ")");
                }
            }
        }

    }

    public static void main(String[] args) {
        int pairs[][] = { { 1, 2 }, { 3, 5 }, { 2, 1 }, { 5, 3 }, { 7, 9 },{9,7} };
        System.out.println("Symmetric pairs");
        findSymmetricPairs(pairs);
    }

}
