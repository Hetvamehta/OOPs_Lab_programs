public class ParallelSumCalculator {
    static class SumTask extends Thread {
        private final int start;
        private final int end;
        private long sum;

        SumTask(String name, int start, int end) {
            super(name);
            this.start = start;
            this.end = end;
        }

        public void run() {
            long total = 0;
            for (int i = start; i <= end; i++) {
                total += i;
            }
            sum = total;
            System.out.println(getName() + " sum: " + sum);
        }

        long getSum() {
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        SumTask t1 = new SumTask("Thread-1", 1, 1000);
        SumTask t2 = new SumTask("Thread-2", 1001, 2000);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        long finalSum = t1.getSum() + t2.getSum();
        System.out.println("Final Sum: " + finalSum);
    }
}
