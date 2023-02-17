package org.example;

public class Counter {
    private int value = 0;
    public void increment(){
        /**
         * 1. read the variable
         * 2. Increase the variable
         * 3. Write the variable value
         */
        value++;
    }

    public void decrement(){
        /**
         * 1. read the variable
         * 2. Decrease the variable
         * 3. Write the variable value
         */value--;}
    public int getValue() {
        return value;
    }
}
