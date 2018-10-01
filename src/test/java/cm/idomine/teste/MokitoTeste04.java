package cm.idomine.teste;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MokitoTeste04
{

    // If we want to mock only specific behaviors and call the real methods for unstubbed behaviors,
    // then we can create a spy object using Mockito spy() method.

    @Test
    public void test()
    {

        List<String> list = new ArrayList<String>();
        List<String> spyOnList = spy(list);

        when(spyOnList.size()).thenReturn(10);
        assertEquals(10, spyOnList.size());

        // calling real methods since below methods are not stubbed
        spyOnList.add("Pankaj");
        spyOnList.add("Meghna");
        assertEquals("Pankaj", spyOnList.get(0));
        assertEquals("Meghna", spyOnList.get(1));
    }
}
