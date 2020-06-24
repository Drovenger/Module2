
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]) {

        // create a vector of initial capacity 5
        Vector vec = new Vector(5);

        for (int i = 0; i < 10; i++) {
            vec.add(0,i);
        }
        System.out.println("Content of the vector: "+vec);
        System.out.println("Size of the vector: "+vec.size());

        // ensure the capacity of the vector and add elements
        vec.ensureCapacity(40);

        for (int i = 0; i < 10; i++) {
            vec.remove(0);
        }
        System.out.println("Content of the vector after increasing the size: "+vec);
        System.out.println("Size of the vector after increase: "+vec.size());
    }
}
