import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi muốn kiểm tra các từ lặp lại: ");
        String string = scanner.nextLine();

        // Tách các từ trong chuỗi vừa nhập
        String[] listChart = string.split(" +");

        // Tạo TreeMap
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (String s : listChart) {
            s = s.toLowerCase();
            if (map.containsKey(s)) {
                int plus = map.get(s) + 1;
                map.put(s, plus);
            } else {
                map.put(s, 1);
            }
        }
        map.forEach((s, a) -> {
            System.out.println(s + ": " + a);
        });
    }
}