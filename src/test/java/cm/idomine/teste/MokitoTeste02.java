package cm.idomine.teste;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MokitoTeste02
{
    // When using @Mock annotation, we have to make sure that we call MockitoAnnotations.
    // initMocks(this) to initialize the mocked object. We can do this in testing framework
    // setup methods that are executed before the tests.

    @Mock
    List<String> mockList;

    @Before
    public void setup()
    {
        // if we don't call below, we will get NullPointerException
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test()
    {
        when(mockList.get(0)).thenReturn("JournalDev");
        assertEquals("JournalDev", mockList.get(0));
    }
}
