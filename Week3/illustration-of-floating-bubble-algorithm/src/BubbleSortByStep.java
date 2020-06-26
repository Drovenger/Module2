import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        //System.out.println("Enter " + list.length + " value:");
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Your input list: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
        //quickSort(list, 0, list.length - 1);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;/* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            for (int i : list) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            //insert list[i] into a sorted sublist list[0...i-1]
            //so that list[0..i] is sorted
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            //insert the current element into list[k+1]
            list[k + 1] = currentElement;
        }
    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}