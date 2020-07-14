public class Main {
    public static void main(String[] args) {
        int i=-5;
        while (i<=5){
            if (i>=0)
                break;
            else {
                i++;
                continue;
            }
            System.out.println("lop");
        }
    }
}