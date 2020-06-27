package com.company;

import com.company.rates.Rate;

public class MyExecutor {
    public static void runTwoThreads(int size){
        MyThread myThread1 = new MyThread(size);
        MyThread myThread2 = new MyThread(size);
        myThread1.start();
        myThread2.start();
        while(true) {
            if(myThread1.getCompleted()==true && myThread2.getCompleted()==true) {
                System.out.println(myThread1.getCompleted());
                System.out.println(myThread2.getCompleted());
                Rate[] rates1 = new Rate[size];
                Rate[] rates2 = new Rate[size];
                rates1 = myThread1.getRatesForConcurrency();
                rates2 = myThread2.getRatesForConcurrency();
                for (int i = 0; i < rates1.length; i++) {
                    System.out.println(rates1[i]);
                }
                for (int i = 0; i < rates2.length; i++) {
                    System.out.println(rates2[i]);
                }
                return;
            }
        }
    }
}
