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
public class AlarmTest {
    
    public AlarmTest() {
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
     * Test of checkMinutes method, of class Alarm.
     */
    @Test
    public void testCheckMinutes() {
        System.out.println("checkMinutes");
        int n = 0;
        Alarm instance = null;
        instance.checkMinutes(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHour method, of class Alarm.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Alarm instance = null;
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinute method, of class Alarm.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        Alarm instance = null;
        int expResult = 0;
        int result = instance.getMinute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Alarm.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Alarm instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHour method, of class Alarm.
     */
    @Test
    public void testSetHour() {
        System.out.println("setHour");
        int n = 0;
        Alarm instance = null;
        instance.setHour(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinute method, of class Alarm.
     */
    @Test
    public void testSetMinute() {
        System.out.println("setMinute");
        int n = 0;
        Alarm instance = null;
        instance.setMinute(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of snooze method, of class Alarm.
     */
    @Test
    public void testSnooze() {
        System.out.println("snooze");
        Alarm instance = null;
        instance.snooze();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deactivate method, of class Alarm.
     */
    @Test
    public void testDeactivate() {
        System.out.println("deactivate");
        Alarm instance = null;
        instance.deactivate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Alarm.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        boolean b = false;
        Alarm instance = null;
        instance.setType(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayTime method, of class Alarm.
     */
    @Test
    public void testDisplayTime() {
        System.out.println("displayTime");
        int n = 0;
        Alarm instance = null;
        String expResult = "";
        String result = instance.displayTime(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarm method, of class Alarm.
     */
    @Test
    public void testGetAlarm() {
        System.out.println("getAlarm");
        Alarm instance = null;
        String expResult = "";
        String result = instance.getAlarm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTime method, of class Alarm.
     */
    @Test
    public void testCheckTime() {
        System.out.println("checkTime");
        String time = "";
        Alarm instance = null;
        boolean expResult = false;
        boolean result = instance.checkTime(time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activate method, of class Alarm.
     */
    @Test
    public void testActivate() {
        System.out.println("activate");
        Alarm instance = null;
        instance.activate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Alarm.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alarm instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
