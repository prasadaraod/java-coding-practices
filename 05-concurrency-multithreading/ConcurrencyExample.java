import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyExample {

    public static void main(String[] args) {
        // 1. Basic Thread Creation (Runnable)
        Thread thread = new Thread(() -> {
            System.out.println("Running in a separate thread: " + Thread.currentThread().getName());
        });
        thread.start();

        // 2. ExecutorService (Thread Pool)
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        Runnable task1 = () -> {
            System.out.println("Task 1 running in " + Thread.currentThread().getName());
        };
        
        Runnable task2 = () -> {
            System.out.println("Task 2 running in " + Thread.currentThread().getName());
        };

        executor.submit(task1);
        executor.submit(task2);

        // Shutdown the executor
        executor.shutdown();
        try {
            if (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
        
        // 3. Virtual Threads (Java 21+)
        // Thread.startVirtualThread(() -> {
        //     System.out.println("Running in a virtual thread: " + Thread.currentThread().getName());
        // });
    }
}
