package org.example;

public class RaceCondition {
    public static Counter counter = new Counter();
    public static void main(String[] args) throws InterruptedException {

        System.out.println(" the counter started at " + counter.getValue());

        Thread t1 = ThreadUtil.createAndRunThread(()->{
            for (int i = 0 ; i<100 ; i++){
                try {
                    Thread.sleep(50);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }counter.increment(); // value = 0 , value = 100
            }
        });

        Thread t2 = ThreadUtil.createAndRunThread(()->{
            for (int i = 0 ; i<100 ; i++){
                try {
                    Thread.sleep(50);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }counter.decrement(); // value = 100, 100-100 = 0
            }
        });
        t1.join();
        t2.join();

        System.out.println(" the counter ended at " + counter.getValue());

        //t.joint() wait for the thread to finish
    }
}
