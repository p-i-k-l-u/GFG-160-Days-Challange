public class SecondLargest {

    public int getSecondLargest(int[] nums) {
        // Initialize the largest and second largest values
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Iterate over the array
        for (int num : nums) {
            if (num > first) {
                // If we find a new largest number, update both
                second = first;
                first = num;
            } else if (num > second && num < first) {
                // If num is between first and second, update second
                second = num;
            }
        }

        // If no second largest value is found, return -1
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        int[] nums = {10, 5, 20, 20, 8};
        System.out.println("Second largest number is: " + obj.getSecondLargest(nums));
    }
}
