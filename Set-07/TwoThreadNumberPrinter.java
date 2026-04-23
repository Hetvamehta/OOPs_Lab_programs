public class TwoThreadNumberPrinter {
    static class NumberTask extends Thread {
        private final int start;
        private final int end;
        private final int delay;

        NumberTask(String name, int start, int end, int delay) {
            super(name);
            this.start = start;
            this.end = end;
            this.delay = delay;
        }

        public void run() {
            for (int i = start; i <= end; i++) {
                System.out.println(getName() + ": " + i);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        Thread t1 = new NumberTask("Thread-1", 1, 10, 1000);
        Thread t2 = new NumberTask("Thread-2", 11, 20, 500);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
