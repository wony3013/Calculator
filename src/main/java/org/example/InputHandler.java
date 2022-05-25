package org.example;

import java.util.Arrays;

public class InputHandler {

    public String[] splitText(String text){
        return text.split(" ");
    }

    public int calculation(String[] splitedText){
        Arrays.stream(splitedText).iterator().hasNext();
        return 0;
    }

    public String[] apply(String[] splitedText){
        Calculator calculator = new Calculator();
//        return calculator.calculator(sign, number1, number2);
        return null;
    }


}
