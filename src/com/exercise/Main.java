package com.exercise;

public class Main {
    public static void main(String[] args) {


        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        NumberGenerator2 generator2 = new NumberGenerator2();

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(generator2);

        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
