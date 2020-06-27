package com.company.parts;

public class MyCharacter {
    char character;
    public MyCharacter(char character){
        this.character = character;
    }

    @Override
    public String toString() {
        return "" + character;
    }

    public char getCharacter() {
        return character;
    }
}
