package com.company;

import com.company.parts.Text;

public class Main {

    public static void main(String[] args) {
        Text text = ReadAndParse.myRead();
        System.out.println(text);
        text.deleteConsonantWords(4);
        System.out.println(text);
    }
}
