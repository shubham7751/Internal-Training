package listner;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listner.listner1.class)
public class listner11 {
    @Test
    public void first(){
        System.out.println("this is first........... ");
        Assert.assertEquals("A","A");
    }
    @Test
    public void second(){
        System.out.println("this is second ...............");
       Assert.assertEquals("A","B");
       // throw new SkipException("xyz");
    }
    @Test
    public void third(){
        System.out.println("this is third.................. ");
        throw new SkipException("third");
//        Assert.assertEquals("A","C");
    }

}
//listner.listner1.class