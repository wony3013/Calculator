package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class InputHandlerTest {

    InputHandler ih = new InputHandler();

    @Test
    public void splitTextTest() {
        String result = "14 * 6";
        assertEquals(ih.splitText(result), new String[]{"14", "*", "6"});
    }

    @Test
    public void stackSizeCheckTest(){
        String[] result = {"14", "*", "6", "+", "1"};
        assertEquals(ih.setStack(result).size(), 5);
    }






}