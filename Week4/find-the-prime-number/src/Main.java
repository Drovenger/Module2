public class Main {
    public static void main(String[] args) {
        LazyPrime lazyPrime = new LazyPrime();
        OptimizedPrime optimizedPrime = new OptimizedPrime();

        Thread thread1 = new Thread(lazyPrime);
        Thread thread2 = new Thread(optimizedPrime);

        thread1.start();
        thread2.start();
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//        thread2.start();
//        try {
//            thread2.join();
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
    }
}

class LazyPrime implements Runnable {
    private boolean primeNumberCheck(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        boolean primeNumber;
        for (int i = 2; i < 200; i++) {
            primeNumber = primeNumberCheck(i);
            if (primeNumber) {
                System.out.println(i + "\t");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Lazy Prime execution time: " + (endTime - startTime) + " milliseconds" + "\n--------");
    }
}

class OptimizedPrime implements Runnable {
    private boolean primeNumberCheck(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        boolean primeNumber;
        for (int i = 2; i < 200; i++) {
            primeNumber = primeNumberCheck(i);
            if (primeNumber) {
                System.out.println(i + "\t");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Optimized prime execution time: " + (endTime - startTime) + " milliseconds" + "\n--------");
    }
}