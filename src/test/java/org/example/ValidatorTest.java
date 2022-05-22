package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void isEmptyCheckTest() {
        expectedException.expect(IllegalArgumentException.class);
        Validator validator = new Validator();
        validator.isEmptyCheck(" ");
    }

    @Test
    public void isNotEmptyCheckTest() {
        expectedException.expect(IllegalArgumentException.class);
        Validator validator = new Validator();
        validator.isEmptyCheck("16");
    }

    @Test
    public void signCheckArithmeticTest() {
        expectedException.expect(IllegalArgumentException.class);
        Validator validator = new Validator();
        validator.signCheck("*");
    }

    @Test
    public void signCheckNumberTest() {
        expectedException.expect(IllegalArgumentException.class);
        Validator validator = new Validator();
        validator.signCheck("1");
    }

    @Test
    public void signCheckWrongTest() {
        expectedException.expect(IllegalArgumentException.class);
        Validator validator = new Validator();
        validator.signCheck("^");
    }
}