public class TriangleClassifier {
    public static String TriangleClassifier1(int a, int b, int c) {
        if (a == b && a == c) {
            return "Tam giác đều!";
        }
        return TriangleClassifier1(a, b, c);
    }

    public static String TriangleClassifier2(int a, int b, int c) {
        if (a == b && a != c) {
            return "Tam giác cân!";
        }
        return TriangleClassifier2(a, b, c);
    }

    public static String TriangleClassifier3(int a, int b, int c) {
        if (a != b && a != c && c != b) {
            return "Tam giác thường!";
        }
        return TriangleClassifier3(a, b, c);
    }

    public static String TriangleClassifier4(int a, int b, int c) {
        if (a > (b + c)) {
            return "Không phải tam giác!";
        }
        if (a <= 0)
            return "Không phải tam giác!";
        return TriangleClassifier4(a, b, c);
    }
}