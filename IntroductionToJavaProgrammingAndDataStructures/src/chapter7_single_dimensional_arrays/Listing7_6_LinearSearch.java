package chapter7_single_dimensional_arrays;

// Linear Search - elements don't have to be ordered first (useful for small or unsorted arrays)
public class Listing7_6_LinearSearch {

    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4); // Returns 1
        int j = linearSearch(list, -4); // Returns −1
        int k = linearSearch(list, -3); // Returns 5

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }

    /**
     * The method for finding a key in the list
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
