package Multithread;
class RunnableTask implements Runnable {
    public void run() {
        System.out.println("Running");
    }
}
public class runnble {
    public static void main(String[] args) {
        RunnableTask t1 = new RunnableTask();
        Thread tsk1 = new Thread(t1);
        tsk1.start();
    }
}
