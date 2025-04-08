class rotateArray{

static void rotateArr(int arr[], int d) {
    int n = arr.length;
    d %= n;
    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
    reverse(arr, 0, n - 1);
}

static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int d = 2;  // Rotate by 2 positions
    
    System.out.println("Original array: ");
    for (int i : arr) {
        System.out.print(i + " ");
    }

    rotateArr(arr, d);

    System.out.println("\nArray after rotation: ");
    for (int i : arr) {
        System.out.print(i + " ");
    }
}

}
