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
                //use comma as separator
                String[] country = line.split(csvSplitBy);
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
