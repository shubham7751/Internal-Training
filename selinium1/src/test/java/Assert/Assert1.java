package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
    SoftAssert SA=new SoftAssert();
    @Test
    public void goo(){
        SA.assertTrue(false);
        SA.assertEquals("A","A");
        SA.assertEquals("A","B");
    }
    @Test
    void foo(){
        Assert.assertTrue(true);
        Assert.assertEquals("A","A");
//        Assert.assertEquals("A","A");
//        Assert.assertEquals("A","A");
    }

}
