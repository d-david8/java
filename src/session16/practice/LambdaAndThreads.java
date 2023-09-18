package session16.practice;

public class LambdaAndThreads {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Running in a separate thread!");
        Thread tread =new Thread(runnable);
        tread.start();
    }
}
