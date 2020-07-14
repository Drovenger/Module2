import java.io.*;

public class FileIO {
    public void writeFile(String path) throws IOException {
        FileWriter csvFile = new FileWriter(path);
        Contact contact = new Contact();
        csvFile.write(contact.getPhone_number() + "," + contact.getGroup() + "," + contact.getName() + "," + contact.getGender() + "," + contact.getAddress() + "," + contact.getBirthday() + "," + contact.getEmail());
        csvFile.close();
    }

    public boolean readFile(String path) {
        boolean check = false;
        String csvFile = path;
        String line = "";
        String csvSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] contact = line.split(csvSplitBy);
                for (int i = 0; i < contact.length; i++) {
                    System.out.printf("'%-21s'", contact[i]);
                }
                System.out.print("\n");
            }
            check = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return check;
    }
}