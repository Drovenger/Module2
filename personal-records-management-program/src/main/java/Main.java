import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String filePath = "data/contacts.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static Manager manager = new Manager();
    private static FileIO fileIO = new FileIO();

    public static void main(String[] args) throws IOException {
        Main.showMenu();
        Main.controller();
    }

    public static void showMenu() {
        System.out.println("\n---- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ----");
        System.out.println("Chọn chức năng theo số (để tiếp tục):");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    public static int scannerChoiceMenu() {
        int choiceMenu = scanner.nextInt();
        scanner.nextLine();
        while (choiceMenu < 1 || choiceMenu > 9) {
            System.out.print("Không hợp lệ! Nhập lại: ");
            choiceMenu = scanner.nextInt();
            scanner.nextLine();
        }
        return choiceMenu;
    }

    public static void controller() throws IOException {
        int choice = Main.scannerChoiceMenu();
        switch (choice) {
            case 1:
                System.out.println("1.Xem danh sách");
                manager.show();
                Main.showMenu();
                Main.controller();
                break;
            case 2:
                System.out.println("2. Thêm mới");
                manager.add();
                Main.showMenu();
                Main.controller();
                break;
            case 3:
                System.out.println("3. Cập nhật");
                manager.edit();
                Main.showMenu();
                Main.controller();
                break;
            case 4:
                System.out.println("4. Xóa");
                manager.delete();
                Main.showMenu();
                Main.controller();
                break;
            case 5:
                System.out.println("5. Tìm kiếm");
                manager.search();
                Main.showMenu();
                Main.controller();
                break;
            case 6:
                System.out.println("6. Đọc từ file");
                fileIO.readFile(filePath);
                Main.showMenu();
                Main.controller();
                break;
            case 7:
                System.out.println("7. Ghi vào file");
                fileIO.writeFile(filePath);
                Main.showMenu();
                Main.controller();
                break;
            case 8:
                System.exit(0);
                break;
        }
    }
}