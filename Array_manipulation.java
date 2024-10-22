
public class Array_manipulation {
    public static void main(String[] args) {
        int[] arr = {200, 40, 60, 80, 140, 180, 100, 160, 120, 20};

        System.out.println("Original Array:");
        printArray(arr);



        // Linear Search
        int searchElement = 180;  // You can change this value for different searches
        int index = linearSearch(arr, searchElement);

        // Bubble Sort
        bubbleSort(arr);
        System.out.println("Sorted Array (Bubble Sort):");
        printArray(arr);
        
        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found.");
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Bubble Sort algorithm
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Linear Search algorithm
    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;  // Return index if found
            }
        }
        return -1;  // Return -1 if not found
    }
}
