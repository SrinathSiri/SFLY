package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableAnno {
    @Test(description = "Regression",invocationCount = 2)
    public void m1(){
        System.out.println("m1 method");
    }
    @Test(enabled = false)
    public void m2(){
        System.out.println("m2 method");
    }
    @Test(description = "Sanity")
    public void m3(){
        System.out.println("m3 method");
    }
    @Test(description = "Functional")
    public void m4(){
        Assert.assertEquals(1,1);
        System.out.println("m4 method");
    }
}
