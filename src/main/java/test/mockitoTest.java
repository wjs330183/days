package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import static org.mockito.Mockito.*;

public class mockitoTest {
    public static void main(String[] args) {
        List<String> list = mock(List.class);
        when(list.get(0)).thenReturn("helloworld");
        String result = list.get(0);
        verify(list).get(0);
        Assert.assertEquals("helloworld", result);

    }
}
