package com.exercise.PrimeNumber;

public class LazyPrimeFactorization extends Thread{
    @Override
    public void run() {
        int num = 50;
        for (int i=3; i<=num; i++) {
            boolean isPrime = true;
            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " lazy \t");
            }
        }
    }
}
