package javathread;

public class HelloRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello From A Thread");
    }
    
}
