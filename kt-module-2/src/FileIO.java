import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    private File file;

    public FileIO(String path) {
        file = new File(path);
    }

    public void writeFile(List<Contact> contactList) throws IOException {
        FileWriter writer = new FileWriter(file);
        BufferedWriter wr = new BufferedWriter(writer);
        if (file.exists() && !file.isDirectory()) {
            wr.append("Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ,Ngày sinh,Email \n");

            for (Contact contact : contactList) {
                wr.append(contact + "\n");
            }
            wr.flush();
            wr.close();
        }
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