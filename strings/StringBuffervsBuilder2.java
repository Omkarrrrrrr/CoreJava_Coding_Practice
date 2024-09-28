public class StringBuffervsBuilder2 {
    public static void main(String[] args)throws InterruptedException {
        StringBuilder builder = new StringBuilder("Initial ");
        
        // Creating two threads that append to the same StringBuilder
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                builder.append("Thread1 ");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                builder.append("Thread2 ");
            }
        });

        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();

        System.out.println("Final builder: " + builder.toString());
    }
}
