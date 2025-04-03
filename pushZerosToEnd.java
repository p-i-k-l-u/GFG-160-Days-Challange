public class pushZerosToEnd {

    // Method to push all zeros to the end of the array
    public void pushZerostoend(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element is not zero, swap it with the element at nonZeroIndex
            if (arr[i] != 0) {
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create an instance of the class
        pushZerosToEnd pze = new pushZerosToEnd();
        
        // Test array
        int[] arr = {0, 1, 0, 3, 12};
        
        // Print the original array
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Call pushZerostoend to move all zeros to the end
        pze.pushZerostoend(arr);
        
        // Print the modified array
        System.out.println("Array after pushing zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
