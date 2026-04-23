public class SequentialThreeThreadPrinter {
    static class RangeTask extends Thread {
        private final int start;
        private final int end;

        RangeTask(String name, int start, int end) {
            super(name);
            this.start = start;
            this.end = end;
        }

        public void run() {
            for (int i = start; i <= end; i++) {
                System.out.println(getName() + ": " + i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        Thread t1 = new RangeTask("T1", 1, 100);
        Thread t2 = new RangeTask("T2", 101, 200);
        Thread t3 = new RangeTask("T3", 201, 300);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
