import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static final String REGEX = "^[CAP]\\d{4}[GHIKLM]\\d{1}$";
    private static Pattern pattern;
    private Matcher matcher;

    public ValidateClass() {
        pattern = pattern.compile(REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
