package com.company;

import com.company.rates.Rate;

import java.io.*;

public class Connector{
    static String filename = "file.ser";
    public static void serializeAll(Rate[] rates){
        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            for(int i=0;i<rates.length;i++) {
                out.writeObject(rates[i]);
            }
            out.close();
            file.close();

            System.out.println("Object has been serialized");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public static Rate[] deSerializeAll(int size) {
        Rate[] rates = new Rate[size];

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            for(int i=0;i<size;i++) {
                rates[i] = (Rate) in.readObject();
            }

            in.close();
            file.close();
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        return rates;
    }


}
