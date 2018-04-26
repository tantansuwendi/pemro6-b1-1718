package javathread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
        Thread t = new Thread(new HelloRunnable());
        t.start();
        
        Thread t2 = new HelloThread();
        t2.start();
        for(int i = 0; i < 10; i++){
                System.out.println(i);
        }
        System.out.println("Pause");
    }
}
