package com.mycompany.jenkins_exercise_04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void addTwoNumbersTest()
    {
        App app = new App();
        assertTrue(4.0 == app.addTwoNumbers(2.0, 2.0));
    }

    @Test
    public void addTwoNumbersTest2()
    {
        App app = new App();
        assertTrue(5.0 == app.addTwoNumbers(2.5, 2.5));
    }
}
