import java.util.Arrays;
import java.util.Random;

public class AlgorithmAnalyzer {


    // Generating a Random Integer Array
   
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            // Random numbers between 0 and 9999
            arr[i] = rand.nextInt(10000); 
        }
        return arr;
    }



    // 1. Member 1: Linear Search

    public static long timeLinearSearch(int size, int target) {
        // For Linear Search we use a random, unsorted array.
        int[] data = generateRandomArray(size);
        
        long startTime = System.nanoTime();
        
        // Linear Search Algorithm
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                // Stops when the element is found.
                break; 
            }
        }
        
        long endTime = System.nanoTime();
        return endTime - startTime;
    }



    // 2. Member 2: Binary Search

    public static long timeBinarySearch(int size, int target) {
        // The array must be sorted for Binary Search.
        int[] data = generateRandomArray(size);
        Arrays.sort(data); // Be sure to sort before doing a binary search.

        long startTime = System.nanoTime();
        
        // Binary Search Algorithm 
        // You can implement Recursive or Iterative Binary Search if you want.
        Arrays.binarySearch(data, target);
        
        long endTime = System.nanoTime();
        return endTime - startTime;
    }



    // 3. Member 3: Bubble Sort
   
    public static long timeBubbleSort(int size) {
        // Create a random array and use a copy of it to measure time.
        int[] data = generateRandomArray(size);
        
        long startTime = System.nanoTime();
        
        // Bubble Sort Algorithm
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Swap
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    

    // 4. Member 4: Quick Sort
    
    public static long timeQuickSort(int size) {
        // Quick Sort in Java is often implemented by Arrays.sort().
        // The functions required to implement Quick Sort are shown below.
        int[] data = generateRandomArray(size);
        
        long startTime = System.nanoTime();
        
        // Quick Sort Algorithm implementation method (a recursive helper function is used here)
        quickSort(data, 0, data.length - 1);
        
        long endTime = System.nanoTime();
        return endTime - startTime;
    }



    // Quick Sort Helper - Main function
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // Before partitioning the element
            quickSort(arr, pi + 1, high);  // After partitioning the element
        }
    }
    



    // Quick Sort Helper - Partition function
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];   // The last element is selected as the pivot.
        int i = (low - 1);   // Index of the small element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                // Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swapping arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }



    // Main Execution
    
    public static void main(String[] args) {
        int[] inputSizes = {100, 500, 1000};
        
        // Target element for search algorithms
        // This is usually a value in the array.
        int targetElement = 5000; 

        
        // Member 1: Linear Search Results
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Member 1: Linear Search");
        printTable("Linear Search", inputSizes, (size) -> timeLinearSearch(size, targetElement));

        
        // Member 2: Binary Search Results
        
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Member 2: Binary Search (Array must be sorted first)");
        printTable("Binary Search", inputSizes, (size) -> timeBinarySearch(size, targetElement));

        
        // Member 3: Bubble Sort Results
        
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Member 3: Bubble Sort");
        printTable("Bubble Sort", inputSizes, AlgorithmAnalyzer::timeBubbleSort);

        
        // Member 4: Quick Sort Results
        
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Member 4: Quick Sort");
        printTable("Quick Sort", inputSizes, AlgorithmAnalyzer::timeQuickSort);
        System.out.println("-----------------------------------------------------------------");
    }

    
    // Function to print results as a table
    
    interface TimeMeasurer {
        long measure(int size);
    }
    
    private static void printTable(String algoName, int[] sizes, TimeMeasurer measurer) {
        System.out.println("Algorithm: " + algoName);
        System.out.printf("%-15s %-15s\n", "Input Size", "Time (ms)");
        System.out.println("-------------------------------");
        
        for (int size : sizes) {
            // Measuring time in nanoseconds
            long nanoSeconds = measurer.measure(size);
            
            // Converting to milliseconds (divide by 1,000,000)
            double milliseconds = (double) nanoSeconds / 1_000_000.0;
            
            // Display in a table (to 4 decimal places)
            System.out.printf("%-15d %-15.4f\n", size, milliseconds);
        }
        System.out.println("-------------------------------");
    }
}



//......................................End of the Main code.....................................//







// Below codes are for individual memebers to implement their own algorithmas seperately //



 // I'm member 1 my role is to implement Linear Search algorithm and measure its execution time.

 /*
  
 import java.util.Arrays;
import java.util.Random;

public class Member1_LinearSearch {

    // Helper: Generating a Random Integer Array
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000); // Random numbers between 0 and 9999
        }
        return arr;
    }

   

    // Member 1's task: Measuring Linear Search time
    
    public static long timeLinearSearch(int size, int target) {
        int[] data = generateRandomArray(size);
        long startTime = System.nanoTime();
        
        // Linear Search Algorithm
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                break;
            }
        }
        
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    

    // Main Execution
    
    public static void main(String[] args) {
        int[] inputSizes = {100, 500, 1000}; [cite: 29]
        int targetElement = 5000; // Value to search for

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Member 1: Linear Search");
        printTable("Linear Search", inputSizes, (size) -> timeLinearSearch(size, targetElement));
        System.out.println("-----------------------------------------------------------------");
    }
    
    // Helper: Function to print results as a table
    interface TimeMeasurer {
        long measure(int size);
    }
    
    private static void printTable(String algoName, int[] sizes, TimeMeasurer measurer) {
        System.out.println("Algorithm: " + algoName);
        System.out.printf("%-15s %-15s\n", "Input Size", "Time (ms)");
        System.out.println("-------------------------------");
        
        for (int size : sizes) {
            long nanoSeconds = measurer.measure(size);
            double milliseconds = (double) nanoSeconds / 1_000_000.0;
            System.out.printf("%-15d %-15.4f\n", size, milliseconds);
        }
        System.out.println("-------------------------------");
    }
}


  */