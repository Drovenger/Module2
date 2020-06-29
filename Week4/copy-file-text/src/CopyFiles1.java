import java.io.*;

public class CopyFiles1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide input and output files");
            System.exit(0);
        }

        File inputFile = new File("Hello.txt");
        File outputFile = new File("Hello1.txt");


        try (
                InputStream inputStream = new FileInputStream(inputFile);
                OutputStream outputStream = new FileOutputStream(outputFile)
        ) {

            int byteRead;

            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}