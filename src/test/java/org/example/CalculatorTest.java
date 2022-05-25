package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator cal = new Calculator();

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

    @Test(expected = IllegalArgumentException.class)
    public void divisionZeroTest(){
        cal.calculator("/",2,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrongSignTest(){
        cal.calculator("$", 6, 2);
    }


}