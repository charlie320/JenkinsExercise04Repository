package com.mycompany.jenkins_exercise_04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addTwoNumbersTest()
    {
        App app = new App();
        assertTrue(4.0 == app.addTwoNumbers(2.0, 2.0));
    }
}
