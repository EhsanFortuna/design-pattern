package com.fortunaco.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Test For Singleton Design Pattern
 */
public class SingletonTest {

    /***/
    final public transient String serialID;


    /***/
    public SingletonTest() {
        serialID = "1";
    }


    /**
     * To Prevent Low Of Demeter Problem
     */
    public boolean isEqual(final Object firstObject, final Object secondObject) {
        return firstObject.equals(secondObject);
    }


    /**
     * Test That Instance Are equal
     */
    @Test
    public void testSomeLibraryMethod() {

        final Singleton firstObject = Singleton.INSTANCE;
        final Singleton secondObject = Singleton.INSTANCE;
        assertTrue("Singleton Works", isEqual(firstObject, secondObject));
    }
}
