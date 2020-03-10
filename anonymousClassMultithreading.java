import java.io.*;
import java.util.*;

class anonymousClassMultithreading {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Child Thread");
            }
        };
        t.start();
        System.out.println("Parent Thread");
    }
}

class anonymousClassMultithreadingImplementingRunnable {
    public static void main(String[] args) {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("Child Thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        System.out.println("Parent Thread");
    }
}