/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplegeometricobject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wilfrido
 */
public class RectangleFromSimpleGeometricObjectTest {
    
    public RectangleFromSimpleGeometricObjectTest() {
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
     * Test of getWidth method, of class RectangleFromSimpleGeometricObject.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        double width = 2.0;
        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject();
        double expResult = 2.0;
        double result = rectangle.getWidth(width);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
        System.out.println(expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class RectangleFromSimpleGeometricObject.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        double width = 2.0;
        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject();
        rectangle.setWidth(width);
        System.out.println(width);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class RectangleFromSimpleGeometricObject.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        double height = 4.0;
        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject();
        double expResult = 4.0;
        double result = rectangle.getHeight(height);
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
        System.out.println(expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class RectangleFromSimpleGeometricObject.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 4.0;
        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject();
        rectangle.setHeight(height);
        System.out.println(height);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class RectangleFromSimpleGeometricObject.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2,4);
        double expResult = 8.0;
        double result = rectangle.getArea();
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
        System.out.println(expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimeter method, of class RectangleFromSimpleGeometricObject.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2,4);
        double expResult = 12.0;
        double result = rectangle.getPerimeter();
        assertEquals(expResult, result, 0.0);
        System.out.println(result);
        System.out.println(expResult);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
    
}
