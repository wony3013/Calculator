package org.example;

import org.junit.Assert;
import org.junit.Test;

public class InputHandlerTest {

    InputHandler ih = new InputHandler();

    String formula = "2 * 4 * 2";

    @Test
    public void splitTextTest() {
        Assert.assertEquals(ih.splitText(formula), new String[]{"2", "*", "4", "*", "2"});
    }

    @Test
    public void onestepText(){
        String[] splitedText = ih.splitText(formula);
        String[] result = ih.apply(splitedText);
        Assert.assertArrayEquals(result, new String[]{"8", "*", "2"});
    }

    @Test
    public void calculatorTest(){
        String[] splitedText = ih.splitText(formula);
        int result = ih.calculation(splitedText);
        Assert.assertEquals(result, 16);
    }






}