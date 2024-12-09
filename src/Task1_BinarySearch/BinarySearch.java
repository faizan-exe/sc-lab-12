package Task1_BinarySearch;

public class BinarySearch {
    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (array == null || array.length == 0) return -1; // Error handling
        if (left > right) return -1; // Base case

        int mid = left + (right - left) / 2;

        if (array[mid] == target) return mid;
        else if (array[mid] > target)
            return binarySearchRecursive(array, target, left, mid - 1);
        else
            return binarySearchRecursive(array, target, mid + 1, right);
    }
}
