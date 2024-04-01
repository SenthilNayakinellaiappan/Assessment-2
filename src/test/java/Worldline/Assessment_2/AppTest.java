package Worldline.Assessment_2;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AppTest 
{
    @Test
    public void testOdd() 
    {
        assertEquals("ODD", App.play(21));
    }
    @Test
    public void testEven() 
    {
        assertEquals("EVEN", App.play(4));
    }

    @Test
    public void testPrime() 
    {
        assertEquals("ODD and PRIME", App.play(3));
    }
}
