public class BinarySearchRunner {
    public static void main(String[] args) {
        //    index #: 0   1  2  3   4   5   6   7   8   9  10  11  12  13   14
        int[] arr = {-10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108};

        System.out.println("array 1: -10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108");
        System.out.println("indices:   0   1  2  3   4   5   6   7   8   9  10  11  12   13   14");

        // test when the target is in the middle (found on the first try)
        int idx = BinarySearch.binarySearch(arr, 23);
        System.out.println("\nthe number 23 was found at index: " + idx);

        // test when the target is found after TWO iterations
        idx = BinarySearch.binarySearch(arr, 55);
        System.out.println("\nthe number 55 was found at index: " + idx);

        // test when the target is found after THREE iterations
        idx = BinarySearch.binarySearch(arr, 14);
        System.out.println("\nthe number 14 was found at index: " + idx);

        // test when the target is found after FOUR iterations (max for array size)
        idx = BinarySearch.binarySearch(arr, 81);
        System.out.println("\nthe number 81 was found at index: " + idx);

        // test when the target is found after FOUR iterations (max for array size)
        idx = BinarySearch.binarySearch(arr, 17);
        System.out.println("\nthe number 17 was found at index: " + idx);

        // test when the target is the first item in the array (takes 4 iterations)
        idx = BinarySearch.binarySearch(arr, -10);
        System.out.println("\nthe number -10 was found at index: " + idx);

        // test when the target is the last item in the array (takes 4 iterations)
        idx = BinarySearch.binarySearch(arr, 108);
        System.out.println("\nthe number 108 was found at index: " + idx);

        // test when the target is NOT in the array
        idx = BinarySearch.binarySearch(arr, 13);
        System.out.println("\nthe number 13 was NOT found: " + idx);

        //    index #: 0   1  2  3   4   5   6   7   8   9   10  11  12  13   14   15
        int[] arr2 = {-10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108, 110};
        System.out.println("\narray 2: -10, -6, 0, 2, 12, 14, 17, 23, 35, 45, 49, 55, 81, 100, 108, 110");
        System.out.println("indices:   0   1  2  3   4   5   6   7   8   9  10  11  12   13   14   15");

        // test when the target is in the middle (found on the first try)
        idx = BinarySearch.binarySearch(arr2, 23);
        System.out.println("\nthe number 23 was found at index: " + idx);

        // test when the target is found after TWO iterations
        idx = BinarySearch.binarySearch(arr2, 55);
        System.out.println("\nthe number 55 was found at index: " + idx);

        // test when the target is found after THREE iterations
        idx = BinarySearch.binarySearch(arr2, 14);
        System.out.println("\nthe number 14 was found at index: " + idx);

        // test when the target is found after FOUR iterations (max for array size)
        idx = BinarySearch.binarySearch(arr2, 81);
        System.out.println("\nthe number 81 was found at index: " + idx);

        // test when the target is found after FOUR iterations (max for array size)
        idx = BinarySearch.binarySearch(arr2, 17);
        System.out.println("\nthe number 17 was found at index: " + idx);

        // test when the target is the first item in the array (takes 4 iterations)
        idx = BinarySearch.binarySearch(arr2, -10);
        System.out.println("\nthe number -10 was found at index: " + idx);

        // test when the target is the last item in the array (takes 4 iterations)
        idx = BinarySearch.binarySearch(arr2, 110);
        System.out.println("\nthe number 110 was found at index: " + idx);

        // test when the target is NOT in the array
        idx = BinarySearch.binarySearch(arr2, 13);
        System.out.println("\nthe number 13 was NOT found: " + idx);

        // test when the target is NOT in the array
        idx = BinarySearch.binarySearch(arr2, 109);
        System.out.println("\nthe number 109 was NOT found: " + idx);
    }
}