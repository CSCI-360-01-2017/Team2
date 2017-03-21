/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Drew
 */
public class ClockTest {
    
    public ClockTest() {
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
     * Test of run method, of class Clock.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Alarm alarm1 = null;
        Alarm alarm2 = null;
        Clock instance = new Clock();
        instance.run(alarm1, alarm2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHour method, of class Clock.
     */
    @Test
    public void testSetHour() {
        System.out.println("setHour");
        int h = 0;
        Clock instance = new Clock();
        instance.setHour(h);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHour method, of class Clock.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Clock instance = new Clock();
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinutes method, of class Clock.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        int m = 0;
        Clock instance = new Clock();
        instance.setMinutes(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class Clock.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Clock instance = new Clock();
        int expResult = 0;
        int result = instance.getMin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeconds method, of class Clock.
     */
    @Test
    public void testSetSeconds() {
        System.out.println("setSeconds");
        int s = 0;
        Clock instance = new Clock();
        instance.setSeconds(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSec method, of class Clock.
     */
    @Test
    public void testGetSec() {
        System.out.println("getSec");
        Clock instance = new Clock();
        int expResult = 0;
        int result = instance.getSec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAPM method, of class Clock.
     */
    @Test
    public void testGetAPM() {
        System.out.println("getAPM");
        Clock instance = new Clock();
        String expResult = "";
        String result = instance.getAPM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setmid method, of class Clock.
     */
    @Test
    public void testSetmid() {
        System.out.println("setmid");
        String m = "";
        Clock instance = new Clock();
        instance.setmid(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class Clock.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Clock instance = new Clock();
        String expResult = "";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Clock.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Clock.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
