package com.company.userExceptions;

public class ContinueException extends Exception{
    public ContinueException(){};
    public String toString(){
        return ("Option can be 'y' or 'n' ") ;
    }
}
