import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String str = "Sao anh không về chơi thôn Vĩ\n" +
                "Nhìn nắng hàng cau nắng mới lên.\n" +
                "Vườn ai mướt quá xanh như ngọc\n" +
                "Lá trúc che ngang mặt chữ điền.\n" +
                "Gió theo lối gió, mây đường mây,\n" +
                "Dòng nước buồn thiu, hoa bắp lay\n" +
                "Thuyền ai đậu bến sông trăng đó,\n" +
                "Có chở trăng về kịp tối nay\n" +
                "Mơ khách đường xa, khách đường xa,\n" +
                "Áo em trắng quá nhìn không ra\n" +
                "Ở đây sương khói mờ nhân ảnh\n" +
                "Ai biết tình ai có đậm đà";
        str = str.replaceAll(",", "");
        String[] arr = str.split(" ");
        String key = "";
        Integer value;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, new Integer(1));
            }
        }
        // print result
        Set set = map.keySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            key = (String) i.next();
            System.out.println("Word '" + key + "' appear " + map.get(key) + " time");
        }
    }
}