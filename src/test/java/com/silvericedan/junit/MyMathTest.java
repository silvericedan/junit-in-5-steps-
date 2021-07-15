package com.silvericedan.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    MyMath myMath = new MyMath();
    //MyMath.sum
    //1,2,3 => 6

    @BeforeEach
    public void before(){
        System.out.println("Before");
    }

    @Test
    public void test(){
        //Absence of failure is a success
        System.out.println("Empty test");
    }

    @Test
    public void sumWith3Numbers(){
        int result = myMath.sum(new int[]{1,2,3});
        //Check that the result is 6
        //check result==6
        assertEquals(6,result);
        System.out.println("Test1");
        System.out.println(result);
    }

    @Test
    public void sumWith1Number(){
        int result = myMath.sum(new int[]{3});
        assertEquals(3,result);
        System.out.println("Test2");
        System.out.println(result);
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All - Analogous of Before Class from junit4");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All - Analogous of After Class from junit4");
    }
}
