/*
StringBuffer is thread-safe and synchronized, meaning that multiple threads cannot access it simultaneously. 
This makes it safer for multi-threaded environments but slower due to the overhead of synchronization.

StringBuilder is not thread-safe and not synchronized, 
making it faster but not safe for multi-threaded environments.
*/
public class StringBuffervsBuilder1 {
    public static void main(String[] args) throws InterruptedException {

        // main method may throw an InterruptedException (which occurs when one thread
        // is interrupted by another while waiting, sleeping, or otherwise not active).
        // This is necessary because of the join() method that will be used later.

        StringBuffer sb = new StringBuffer("Initial ");
        // Creating two threads that append to the same StringBuffer using anonymous
        // inner classes

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    sb.append("Thread1 ");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    sb.append("Thread2 ");
                }
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final result
        System.out.println("Final buffer: " + sb.toString());
    }
}
