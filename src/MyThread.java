public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        start();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("I am " + getName() + ". Hi all!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s complete.\n", getName());
            }
        }
    }
