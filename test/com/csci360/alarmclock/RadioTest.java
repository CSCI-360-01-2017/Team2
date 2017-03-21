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
public class RadioTest {
    
    public RadioTest() {
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
     * Test of setFreq method, of class Radio.
     */
    @Test
    public void testSetFreq() {
        System.out.println("setFreq");
        double freq = 0.0;
        Radio instance = new Radio();
        instance.setFreq(freq);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVol method, of class Radio.
     */
    @Test
    public void testSetVol() {
        System.out.println("setVol");
        int vol = 0;
        Radio instance = new Radio();
        instance.setVol(vol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
