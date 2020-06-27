package com.company;

import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        Directory directory = new Directory("folder");
        TextFile file1 = new TextFile("first","this is content");
        directory.addFile(file1);
        TextFile file2 = new TextFile("second","this is content of second");
        directory.addFile(file2);
        TextFile file3 = new TextFile("third","this is content of third");
        directory.addFile(file3);
        System.out.println(directory);
        directory.deleteFile(file2);
        System.out.println(directory);
    }
}
