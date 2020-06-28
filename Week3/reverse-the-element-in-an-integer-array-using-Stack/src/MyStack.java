public class MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int max) {
        maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void push(int i) {
        stackArray[++top] = i;
    }
    public int pop() {
        return stackArray[top--];
    }
    public int peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}