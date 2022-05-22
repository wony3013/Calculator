package org.example;

public class Calculator {

    public int calculator(String sign, int number1, int number2){
        return Operator.getResult(sign, number1, number2) ;
    }
}
