//import static org.junit.Assert.*;

import java.util.jar.JarOutputStream;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 3: " + listInteger.get(3));
        System.out.println("element 0: " + listInteger.get(0));
        System.out.println("element 1: " + listInteger.get(1));
    }
}