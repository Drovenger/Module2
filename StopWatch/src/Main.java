import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        int second;
        int millisecond;

        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        System.out.println("Stop Watch");
        while (true) {
            System.out.println("________________________");
            System.out.println("1. Start time");
            System.out.println("2. End time");
            System.out.println("3. Counting elapsed time");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    stopWatch.start();
                    System.out.println("Start time is: 00:00:00");
                    break;
                case 2:
                    stopWatch.end();
                    second = (int) ((stopWatch.getEndTime() - stopWatch.getStartTime()) / 1000);
                    millisecond = (int) (stopWatch.getElapsedTime() % 1000 / 10);
                    if (second < 10 && millisecond < 10) {
                        System.out.println("End time is: 00:0" + second + ":0" + millisecond);
                    } else if (second < 10) {
                        System.out.println("End time is: 00:0" + second + ":" + millisecond);
                    } else if (millisecond < 10) {
                        System.out.println("End time is: 00:" + second + ":0" + millisecond);
                    } else {
                        System.out.println("End time is: 00:" + second + ":" + millisecond);
                    }
                    break;
                case 3:
                    System.out.println("Elapsed time is: " + stopWatch.getElapsedTime() + " millisecond");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
