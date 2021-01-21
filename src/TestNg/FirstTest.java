package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void fiurstTest(){
        String expected="Expected Data";
        String actual="Actual Data";
        Assert.assertEquals(actual,expected);
    }

}
