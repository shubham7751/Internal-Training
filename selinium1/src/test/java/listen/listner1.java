package listen;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class listner1 implements ITestListener {
@Test
    void a(){
        System.out.println("1 test case");
        Assert.assertEquals("A","A");
    }
    @Test
    void b(){
        System.out.println("2 test case");
        Assert.assertEquals("A","B");
    }
    @Test
    void c(){
        System.out.println("3 test case");
        throw new SkipException("error");
    }
}
