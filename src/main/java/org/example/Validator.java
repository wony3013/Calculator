package org.example;

import java.util.regex.Pattern;

public class Validator {

    public void isEmptyCheck(String text){
        if(text.trim().length() <= 0){
            throw new IllegalArgumentException("입력값이 NULL 이거나 빈공백으로만 이루어져 있는 값입니다.");
        }
    }
    public void signCheck(String sign){
        if(Pattern.matches("^[0-9 +-*/]")){

        }
    }

    // 숫자 + 숫자

}
