package com.exercise;

public class NumberGenerator2 implements Runnable{
    public NumberGenerator2() {

    }

    @Override
    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println(i+" thu 2");
            //System.out.println(this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
