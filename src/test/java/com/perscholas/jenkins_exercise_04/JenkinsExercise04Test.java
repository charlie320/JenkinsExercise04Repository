package com.perscholas.jenkins_exercise_04;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class JenkinsExercise04Test 
{
    @Test
    public void sayHelloTest()
    {
        assertTrue(JenkinsExercise04.sayHello().equals("Hello Java from JenkinsExercise04 main method!!!"));
    }

    @Test
    public void sayGoodBye() {
        assertFalse(JenkinsExercise04.sayHello().equals("Goodbye Java from JenkinsExercise04 main method!!!"));
    }
}
