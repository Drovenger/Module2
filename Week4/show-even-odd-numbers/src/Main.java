public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        evenThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class EvenThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + "\t");
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + "\t");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}