package chapter7_single_dimensional_arrays;

import java.util.Arrays;

import static java.util.Arrays.toString;

// Selection Sort
public class Listing7_8_SelectionSort_BinarySearch_Fill {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);

        System.out.println(Arrays.toString(list));
        System.out.println();

        // using java.util.Arrays class methods to sort an array
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        java.util.Arrays.sort(numbers); // Sort the whole array
        System.out.println(Arrays.toString(numbers));
        java.util.Arrays.parallelSort(numbers); // Sort the whole array
        System.out.println(Arrays.toString(numbers));

        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        java.util.Arrays.sort(chars, 1, 3); // Sort part of the array
        System.out.println(Arrays.toString(chars));
        java.util.Arrays.parallelSort(chars, 1, 3); // Sort part of the array
        System.out.println(Arrays.toString(chars));
        System.out.println();

        // using using java.util.Arrays class methods for binary search
        int[] list2 = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " +
                java.util.Arrays.binarySearch(list2, 11));
        System.out.println("2. Index is " +
                java.util.Arrays.binarySearch(list2, 12));

        char[] chars2 = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " +
                java.util.Arrays.binarySearch(chars2, 'a'));
        System.out.println("4. Index is " +
                java.util.Arrays.binarySearch(chars2, 't'));
        System.out.println();

        // comparing arrays
        int[] lista = {2, 4, 7, 10};
        int[] listb = {2, 4, 7, 10};
        int[] listc = {4, 2, 7, 10};
        System.out.println(java.util.Arrays.equals(lista, listb)); // true
        System.out.println(java.util.Arrays.equals(listb, listc)); // false
        System.out.println();

        // fill all or part of the array
        int[] listx = {2, 4, 7, 10};
        int[] listy = {2, 4, 7, 7, 7, 10};
        java.util.Arrays.fill(listx, 5); // Fill 5 to the whole array
        java.util.Arrays.fill(listy, 1, 5, 8); // Fill 8 to a partial array
        System.out.println(java.util.Arrays.toString(listx));
        System.out.println(java.util.Arrays.toString(listy));

    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length−1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

//    public static <T> void printArray(T[] array) {
//        for (T value : array) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//    }
}
