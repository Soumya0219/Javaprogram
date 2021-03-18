public class InterruptedExceptionDemo extends Thread {
    public void run() {
        try {
            Thread.sleep(7000);
            System.out.println("Interrupted Exception");
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        InterruptedExceptionDemo in = new InterruptedExceptionDemo();
        in.start();
        try {
            in.interrupt();
        } catch (Exception e){
            System.out.println("Exception handling");
        }
    }
    }


