package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class NachoFibreTest {

    @Test
    public void fibonacciTest01(){
        NachoFibre nachoFibre = new NachoFibre();
        int expected = 5;
        int actual = nachoFibre.fibonacci(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTest02(){
        NachoFibre nachoFibre = new NachoFibre();
        int expected = 144;
        int actual = nachoFibre.fibonacci(12);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTest03(){
        NachoFibre nachoFibre = new NachoFibre();
        int expected = 1597;
        int actual = nachoFibre.fibonacci(17);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void kalebTest01(){
        NachoFibre nachoFibre = new NachoFibre();
        int expected = -31;
        int actual = nachoFibre.kaleb(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void kalebTest02(){
        NachoFibre nachoFibre = new NachoFibre();
        int expected = 4097;
        int actual = nachoFibre.kaleb(12);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void kalebTest03(){
        NachoFibre nachoFibre = new NachoFibre();
        int expected = -131071;
        int actual = nachoFibre.kaleb(17);
        Assert.assertEquals(expected, actual);
    }
}
