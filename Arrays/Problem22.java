public class Problem22 {
    public static int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(current, maxProduct * current);
            minProduct=  Math.max(current, minProduct * current);

            result=Math.max(result,maxProduct);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -2, 4, -1 };
        System.out.println("maximum product subarray is " + maxProduct(nums));

    }

}
