package com.idomine.teste;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class MokitoTeste01
{
    // We can use Mockito class mock() method to create a mock object of a given class or interface.
    // This is the simplest way to mock an object.

    @SuppressWarnings("unchecked")
    @Test
    public void test()
    {
        // using Mockito.mock() method
        List<String> mockList = mock(List.class);
        when(mockList.size()).thenReturn(5);
        assertTrue(mockList.size() == 5);
    }
}
