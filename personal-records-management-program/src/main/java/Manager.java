import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    protected List<Contact> contactsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public List<Contact> getContactsList() {
        return contactsList;
    }

    public void show() {
        System.out.println("Danh bạ:");
        for (Contact contact : contactsList) {
            System.out.printf("SĐT:%s, Nhóm:%s, Họ tên:%s, Giới tính:%s, Địa chỉ:%s", contact.getPhone_number(), contact.getGroup(), contact.getName(), contact.getGender(), contact.getAddress());
            System.out.print("\n");
        }
    }

    public void add() {
        boolean check = true;
        System.out.print("Nhập số điện thoại (10-11 số): ");
        String phone_number = scanner.nextLine();
        while (!phone_number.matches("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}") || phone_number == "") {
            System.out.print("Số điện thoại không hợp lệ, xin vui lòng nhập lại: ");
            phone_number = scanner.nextLine();
        }

        System.out.print("Nhập tên nhóm: ");
        String group = scanner.nextLine();

        System.out.print("Nhập họ tên: ");
        String name = scanner.nextLine();
        while (name == "") {
            System.out.print("Không hợp lệ, xin vui lòng nhập lại: ");
        }
        System.out.println("Nhập giới tính (nam/nu): ");
        String gender = scanner.nextLine();
        while (check) {
            switch (gender) {
                case "nam":
                case "nu":
                    check = false;
                    break;
                default:
                    System.out.print("Không hợp lệ, xin vui lòng nhập lại (nam/nu): ");
                    gender = scanner.nextLine();
            }

        }
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
        try {
            email.matches("^[\\w\\d]+@[\\w\\d]+\\.[\\w\\d]+$");
        } catch (Exception e) {
            System.out.println("Không hợp lệ, xin vui lòng nhập lại: ");
            e.printStackTrace();
        }

        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        String birthday = scanner.nextLine();
        try {
            birthday.matches("^\\d\\d/\\d\\d/\\d{4}$");
        } catch (Exception e) {
            System.out.println("Không hợp lệ, xin vui lòng nhập lại (dd/mm/yyyy): ");
            e.printStackTrace();
        }

        Contact contact = new Contact(phone_number, group, name, gender, address, email, birthday);
        contactsList.add(contact);
    }

    public void edit() {
        System.out.println("Nhập số điện thoại cần thay đổi: ");
        String phone_number = scanner.nextLine();
        for (Contact contact : contactsList) {
            if (contact.getPhone_number().equals(phone_number)) {
                boolean check = true;
                System.out.print("Nhập số điện thoại (10-11 số): ");
                phone_number = scanner.nextLine();
                while (!phone_number.matches("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}") || phone_number == "") {
                    System.out.print("Số điện thoại không hợp lệ, xin vui lòng nhập lại: ");
                    phone_number = scanner.nextLine();
                }
                contact.setPhone_number(phone_number);

                System.out.print("Nhập tên nhóm: ");
                contact.setGroup(scanner.nextLine());

                System.out.print("Nhập họ tên: ");
                String name = scanner.nextLine();
                while (name == "") {
                    System.out.print("Không hợp lệ, xin vui lòng nhập lại: ");
                }
                contact.setName(name);

                System.out.println("Nhập giới tính (nam/nu): ");
                String gender = scanner.nextLine();
                while (check) {
                    switch (gender) {
                        case "nam":
                        case "nu":
                            check = false;
                            break;
                        default:
                            System.out.print("Không hợp lệ, xin vui lòng nhập lại (nam/nu): ");
                            gender = scanner.nextLine();
                    }
                }
                contact.setGender(gender);

                System.out.print("Nhập địa chỉ: ");
                contact.setAddress(scanner.nextLine());

                System.out.print("Nhập Email: ");
                String email = scanner.nextLine();
                try {
                    email.matches("^[\\w\\d]+@[\\w\\d]+\\.[\\w\\d]+$");
                } catch (Exception e) {
                    System.out.println("Không hợp lệ, xin vui lòng nhập lại: ");
                    e.printStackTrace();
                }
                contact.setEmail(email);

                System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
                String birthday = scanner.nextLine();
                try {
                    birthday.matches("^\\d\\d/\\d\\d/\\d{4}$");
                } catch (Exception e) {
                    System.out.println("Không hợp lệ, xin vui lòng nhập lại (dd/mm/yyyy): ");
                    e.printStackTrace();
                }
                contact.setBirthday(birthday);
            }
        }
    }

    public void delete() {
        System.out.println("Nhập số điện thoại cần xóa: ");
        String phone_number = scanner.nextLine();
        for (Contact contact : contactsList) {
            if (contact.getPhone_number().equals(phone_number)) {
                contactsList.remove(contact);
            } else {
                System.out.println("Không tìm thấy số điện thoại cần xóa!");
            }
        }
    }

    public void search() {
        System.out.println("Bạn muốn tìm theo tên hay số điện thoại?(name/phone");
        String searchInput = scanner.nextLine();
        switch (searchInput) {
            case "name":
                System.out.println("Nhập tên người cần tìm: ");
                String name = scanner.nextLine();
                for (Contact contact : contactsList) {
                    if (contact.getName().equals(name)) {
                        System.out.println(contact.toString());
                    } else {
                        System.out.println("Không tìm thấy số điện thoại này trong danh bạ!");
                    }
                }
            case "phone":
                System.out.println("Nhập số điện thoại cần tìm: ");
                String phone_number = scanner.nextLine();
                for (Contact contact : contactsList) {
                    if (contact.getPhone_number().equals(phone_number)) {
                        System.out.println(contact.toString());
                        break;
                    } else {
                        System.out.println("Không tìm thấy số điện thoại này trong danh bạ!");
                    }
                }
                break;
            default:
                System.out.println("Không hợp lệ xin vui lòng nhập lại!");
                search();
        }
    }
}