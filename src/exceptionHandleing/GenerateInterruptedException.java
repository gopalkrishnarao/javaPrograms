package exceptionHandleing;

class InterruptedThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing item " + i);
                Thread.sleep(1000); // Simulate some work by sleeping for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted. Exiting...");
            System.out.println(" come here.");
            // Handle the interruption (clean up, log, etc.)
        }
    }
}

public class GenerateInterruptedException {

    public static void main(String[] args) {
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();

        // Interrupt the thread after 3 seconds
        try {
            Thread.sleep(3000);
            interruptedThread.interrupt();
        } catch (InterruptedException e) {
        	  System.out.println("not come here.");
              // Handle the interruption (clean up, log, etc.)
            e.printStackTrace();
        }
    }
}

