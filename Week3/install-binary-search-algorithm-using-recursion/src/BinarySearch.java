public class BinarySearch {
    public static int binarySearch(int[] array, int first, int last, int key) {
        int mid = 0;
        if (last >= first) {
            mid = (last + first) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key > array[mid]) {
                return binarySearch(array, mid + 1, last, key);
            } else {
                return binarySearch(array, first, mid - 1, key);
            }
        }
        return -1;
    }
}