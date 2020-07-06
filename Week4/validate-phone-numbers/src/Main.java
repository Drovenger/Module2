public class Main {
    public static final String[] isPhoneNumber = new String[]{"(84)-(912311625)", "(a8)-(912311625)", "((84)-(912311625)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();

        for (String phone : isPhoneNumber) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("Phone Number " + phone + " valid is: " + isValid);
        }
    }
}