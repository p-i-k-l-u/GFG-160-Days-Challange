public class nextPermutation {
    
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2, j = n - 1;

        // Find the first element that is smaller than the next element
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If such an element exists, find the element that is larger than arr[i] from the right
        if (i >= 0) {
            while (arr[j] <= arr[i]) {
                j--;
            }

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Reverse the portion of the array after index i
        reverse(arr, i + 1, n - 1);
    }

    // Function to reverse the array between two indices
    void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main function to test the nextPermutation function
    public static void main(String[] args) {
        nextPermutation solution = new nextPermutation();

        // Example array
        int[] arr = {1, 2, 3};

        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the next permutation
        solution.nextPermutation(arr);

        // Print the next permutation
        System.out.println("Next permutation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
