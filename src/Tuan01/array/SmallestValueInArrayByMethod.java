package Tuan01.array;

public class SmallestValueInArrayByMethod {
    public static int minValue(int[] array) {
        int min_value = array[0];
        for (int value : array) {
            if (min_value > value) {
                min_value = value;
            }
        }
        return min_value;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + index);
    }
}
