package com.idomine.teste;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class MokitoTeste05
{
    // We can use @Spy annotation to spy on an object. Let’s look at a simple example.

    @Spy
    Utils mockUtils;

    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test()
    {
        when(mockUtils.process(1, 1)).thenReturn(5);
        // mocked method
        assertEquals(5, mockUtils.process(1, 1));
        // real method called since it's not stubbed
        assertEquals(20, mockUtils.process(19, 1));

    }

}

class Utils
{
    public int process(int x, int y)
    {
        System.out.println("Input Params = " + x + "," + y);
        return x + y;
    }

}
