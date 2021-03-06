package org.example;

import java.util.regex.Pattern;

public class Validator {

    public void isEmptyCheck(String formula){
        if(formula.trim().length() <= 0){
            throw new IllegalArgumentException("입력값이 NULL 이거나 빈공백으로만 이루어져 있는 값입니다.");
        }
    }
    public void expressionCheck(String formula){
        String regEx = "[^\\d+\\-*/ ]";
        Pattern pattern = Pattern.compile(regEx);
        if(pattern.matcher(formula).find() ){
            throw new IllegalArgumentException("사칙연산에 어긋난 값입니다.");
        }
    }


}
