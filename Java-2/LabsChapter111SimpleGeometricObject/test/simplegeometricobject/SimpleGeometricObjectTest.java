/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegeometricobject;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Wilfrido
 */
public class SimpleGeometricObjectTest {
    
    public SimpleGeometricObjectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getColor method, of class SimpleGeometricObject.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        SimpleGeometricObject instance = new SimpleGeometricObject();
        String expResult = "White";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class SimpleGeometricObject.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "White";
        SimpleGeometricObject instance = new SimpleGeometricObject();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of isFilled method, of class SimpleGeometricObject.
     */
    @Test
    public void testIsFilled() {
        System.out.println("isFilled");
        SimpleGeometricObject instance = new SimpleGeometricObject();
        boolean expResult = false;
        boolean result = instance.isFilled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFilled method, of class SimpleGeometricObject.
     */
    @Test
    public void testSetFilled() {
        System.out.println("setFilled");
        boolean filled = false;
        SimpleGeometricObject instance = new SimpleGeometricObject();
        instance.setFilled(filled);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class SimpleGeometricObject.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        SimpleGeometricObject instance = new SimpleGeometricObject();
        Date expResult = new java.util.Date();
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SimpleGeometricObject.
     */
    @Ignore
    @Test
    public void testToString() {
        System.out.println("toString");
        SimpleGeometricObject instance = new SimpleGeometricObject();
        String expResult = "Created on Mon Feb 13 15:24:51 EST 201 White and filled: false";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
