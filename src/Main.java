public class Main {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        System.out.println("I create threads...");
        Thread thread1 = new MyThread(mainGroup, "thread one");
        Thread thread2 = new MyThread(mainGroup, "thread two");
        Thread thread3 = new MyThread(mainGroup, "thread three");
        Thread thread4 = new MyThread(mainGroup, "thread four");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I complete all threads...");
        mainGroup.interrupt();
    }
}
