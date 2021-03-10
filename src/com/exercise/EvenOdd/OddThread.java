package com.exercise.EvenOdd;

public class OddThread extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            boolean isOdd = i%2!=0;
            if (isOdd) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
