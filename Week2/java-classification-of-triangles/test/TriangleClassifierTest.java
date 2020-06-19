import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangleClassifier1() {
        int a = 2, b = 2, c = 2;
        String expected = "Tam giác đều!";
        String actual = TriangleClassifier.TriangleClassifier1(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void triangleClassifier2() {
        int a = 2, b = 2, c = 3;
        String expected = "Tam giác cân!";
        String actual = TriangleClassifier.TriangleClassifier2(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void triangleClassifier3() {
        int a = 3, b = 4, c = 5;
        String expected = "Tam giác thường!";
        String actual = TriangleClassifier.TriangleClassifier3(a, b, c);
        assertEquals(expected, actual);
    }

    @Test
    void triangleClassifier4() {
        int a = 10, b = 4, c = 5;
        String expected = "Không phải tam giác!";
        String actual = TriangleClassifier.TriangleClassifier4(a, b, c);
        assertEquals(expected, actual);
    }
}