import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source file: ");
        String sourceFile = scanner.nextLine();

        System.out.println("Enter the target file copy: ");
        String sourceTarget = scanner.nextLine();

        try {
            File file = new File(sourceFile);
            BufferedInputStream binIn = new BufferedInputStream(new FileInputStream(file));
            System.out.println(file.length() + "byte");

            File fileTarget = new File(sourceTarget);
            BufferedOutputStream binOut = new BufferedOutputStream(new FileOutputStream(fileTarget));
            while (true) {
                int data = binIn.read();
                if (data == -1) {
                    break;
                }
                binOut.write(data);
            }
            binOut.flush();
        } catch (IOException e) {
            System.out.println("File source not fount!");
        }
    }
}
