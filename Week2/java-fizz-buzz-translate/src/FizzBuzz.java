public class FizzBuzz {
    public String process(int input) {
        if (input > 0) {
            if (input % 3 == 0) {
                if (input % 5 == 0) {
                    return "FizzBuzz";
                } else
                    return "Fizz";
            }
            if (input % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(input);
            }
        } else {
            return "Out of Range!";
        }
    }
}