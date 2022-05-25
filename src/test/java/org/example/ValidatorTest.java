package org.example;

import org.junit.Test;

public class ValidatorTest {

    Validator validator = new Validator();

    String formula = "2 * 4 * 2";

    @Test(expected = IllegalArgumentException.class)
    public void isEmptyCheckTest() {
        validator.isEmptyCheck(" ");
    }

    @Test()
    public void isNotEmptyCheckTest() {
        validator.isEmptyCheck(formula);
    }

    @Test()
    public void expressionCheckTest() {
        validator.expressionCheck(formula);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongExpressionCheckTest() {
        validator.expressionCheck("4 ^ 6");
    }

    @Test
    public void validatorTest(){
        validator.isEmptyCheck(formula);
        validator.expressionCheck(formula);
    }



}