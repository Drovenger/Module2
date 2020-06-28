import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        int[] myArray = {1, 2, 3, 4, 5};
        int size = myArray.length;

        for (int i = 0; i < size; i++) {
            stack.push(myArray[i]);
        }

        int[] reverseArray = new int[size];
        for (int i = 0; i < size; i++) {
            reverseArray[i] = stack.pop();
        }
        System.out.println("Array is: " + Arrays.toString(myArray));
        System.out.println("Reveresd array is:" + Arrays.toString(reverseArray));
    }
}