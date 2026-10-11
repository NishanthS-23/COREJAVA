package mock;
import java.util.Arrays; // Import the Arrays class

public class ArraySorter {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = {5, 4, 3, 2, 1};

        // Print the array before sorting
        System.out.println("Array before sorting: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the array after sorting
        System.out.println("Array after sorting: " + Arrays.toString(numbers));
    }
}