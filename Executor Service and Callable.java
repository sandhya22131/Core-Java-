import java.util.concurrent.*;

public class ExecutorCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<String> task = () -> "Task executed";
        Future<String> result = executor.submit(task);
        System.out.println(result.get());
        executor.shutdown();
    }
}
