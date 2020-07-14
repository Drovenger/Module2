import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CVSReader2 {
    public static void main(String[] args) {
        String csvFile = "src/country.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] country = line.split(csvSplitBy);
                for (int i = 0; i < country.length; i++) {
                    System.out.printf("'%25s' ", country[i]);
                }
                System.out.print("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
