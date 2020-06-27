package com.company;

import com.company.rates.Rate;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyThread extends Thread{
    static String filename = "file.ser";
    Rate[] ratesForConcurrency;
    int ratesSize;
    volatile boolean completed;


    MyThread(int ratesSize){
        super();
        ratesForConcurrency = new Rate[ratesSize];
        this.ratesSize = ratesSize;
        this.completed = false;
    }
    @Override
    public void run() {


        // Deserialization
        System.out.println("Thread is started");
        try
        {
            synchronized (this) {
                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(file);

                // Method for deserialization of object
                for(int i=0;i<this.ratesSize;i++) {
                    this.ratesForConcurrency[i] = (Rate) in.readObject();
                }

                in.close();
                file.close();
                this.completed = true;
            }
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }

    public Rate[] getRatesForConcurrency() {
        return ratesForConcurrency;
    }

    public boolean getCompleted() {
        return completed;
    }
}
