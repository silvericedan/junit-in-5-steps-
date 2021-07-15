package com.silvericedan.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    //MyMath.sum
    //1,2,3 => 6

    @Test
    public void test(){
        //Absence of failure is a success
    }

    @Test
    public void sumWith3Numbers(){
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{1,2,3});
        //Check that the result is 6
        //check result==6
        assertEquals(6,result);
        System.out.println(result);
    }

    @Test
    public void sumWith1Number(){
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{3});
        assertEquals(3,result);
        System.out.println(result);
    }
}
