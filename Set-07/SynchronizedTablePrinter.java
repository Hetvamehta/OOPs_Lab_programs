public class SynchronizedTablePrinter {
    static class TablePrinter {
        synchronized void printTable(int n) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    static class TableTask extends Thread {
        private final TablePrinter printer;
        private final int number;

        TableTask(TablePrinter printer, int number, String name) {
            super(name);
            this.printer = printer;
            this.number = number;
        }

        public void run() {
            printer.printTable(number);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hetva-25");
        TablePrinter printer = new TablePrinter();
        Thread t1 = new TableTask(printer, 5, "T1");
        Thread t2 = new TableTask(printer, 7, "T2");
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
