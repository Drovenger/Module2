public class Main {
    private static ValidateClass validateClass;
    public static final String[] isClass = new String[]{"C0220H1", "A0220G2", "P0220M3", "C0318G1", "M0318G", "P0323A", "M0220G1", "P0220A1"};

    public static void main(String[] args) {
        validateClass = new ValidateClass();
        for (String classes : isClass) {
            boolean isvalid = validateClass.validate(classes);
            System.out.println("Class " + classes + " valid is: " + isvalid);
        }
    }
}
