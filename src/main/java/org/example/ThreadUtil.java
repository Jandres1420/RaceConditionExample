package org.example;

public class ThreadUtil {
    public static Thread createAndRunThread(Runnable runnable){
        Thread t = new Thread(runnable);
        t.start();
        return t;
    }
}
