public class reverseArray {
    

    // print the array 

    public static void printArray(int arr[], int n){
        System.out.print("Revered Array is - \n");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }

    // function to reverse array using recursion 

    public static void reveresArray(int arr[], int start, int end){

        if(start < end){
            int temp = arr[ start];
            arr[start] = arr[end];
            arr[end] = temp;
            reveresArray(arr, start+1, end-1);
        }
    }

    public static void main(String[] args) {
        
        int n = 9;
        int arr[] = {7,5,4,3,23,2,33,6,85};
        reveresArray(arr, 0, n-1);
        printArray(arr, n);
    }



}
