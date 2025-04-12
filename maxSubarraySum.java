public class maxSubarraySum {
    public long maxSubarraySum(int[] arr) {
        long maxh = 0;
        long maxf = Long.MIN_VALUE;

        for (int num : arr) {
            maxh = Math.max(num, maxh + num);
            maxf = Math.max(maxf, maxh);
        }

        return maxf;
    }

    public static void main(String[] args) {
        maxSubarraySum solution = new maxSubarraySum();

        // Example input array
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call the method
        long result = solution.maxSubarraySum(arr);

        // Print the result
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
