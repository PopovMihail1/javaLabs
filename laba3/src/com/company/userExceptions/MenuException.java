package com.company.userExceptions;

public class MenuException extends Exception{
    public MenuException(){};
    public String toString(){
        return ("option can be 1 or 2 or 3 or 4") ;
    }
}
