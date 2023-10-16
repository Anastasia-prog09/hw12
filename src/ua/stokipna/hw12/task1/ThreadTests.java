package ua.stokipna.hw12.task1;

public class ThreadTests {
    public static void main(String[] args) throws InterruptedException {
        final long start = System.currentTimeMillis();
        MyThread myThread = new MyThread();
        myThread.start();

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println("Минуло мілісекунд від моменту запуску програми: " + (System.currentTimeMillis() - start));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

