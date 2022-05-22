package org.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void plusTest(){
        assertEquals(cal.calculator("+", 1, 2), 3);
    }

    @Test
    public void subtractTest(){
        assertEquals(cal.calculator("-", 3, 2), 1);
    }

    @Test
    public void multiplyTest(){
        assertEquals(cal.calculator("*", 2, 3), 6);
    }

    @Test
    public void divisionTest(){
        assertEquals(cal.calculator("/", 6, 2), 3);
    }

    @Test
    public void wrongSignTest(){
        expectedException.expect(IllegalArgumentException.class);
        assertEquals(cal.calculator("$", 6, 2), 3);
    }


}