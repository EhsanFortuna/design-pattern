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
     * To Prevent Law Of Demeter Problem
     * we have to implement this way
     */
    public boolean isEqual(final Object firstObject, final Object secondObject) {
        return firstObject.equals(secondObject);
    }


    /**
     * Test That Instances Are equal
     */
    @Test
    public void testSingletonImplementation() {

        final Singleton firstObject = Singleton.INSTANCE;
        final Singleton secondObject = Singleton.INSTANCE;
        assertTrue("Singleton Works", isEqual(firstObject, secondObject));
    }
}
