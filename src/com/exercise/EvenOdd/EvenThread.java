package com.exercise.EvenOdd;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            boolean isEven = i%2 == 0;
            if (isEven) {
                System.out.println(i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
