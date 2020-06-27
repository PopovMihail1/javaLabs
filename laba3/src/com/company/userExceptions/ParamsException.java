package com.company.userExceptions;

public class ParamsException extends Exception{
    public ParamsException(){};
    public String toString(){
        return ("Param is less than zero") ;
    }

}
