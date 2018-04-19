/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projet.Pilote;

/**
 *
 * @author Trando
 */
public class PiloteTest {
    
    public PiloteTest() {
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
     * Test of getNom method, of class Pilote.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Pilote instance = new Pilote();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Pilote.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Pilote instance = new Pilote();
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNation method, of class Pilote.
     */
    @Test
    public void testGetNation() {
        System.out.println("getNation");
        Pilote instance = new Pilote();
        String expResult = "";
        String result = instance.getNation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLicense method, of class Pilote.
     */
    @Test
    public void testGetLicense() {
        System.out.println("getLicense");
        Pilote instance = new Pilote();
        String expResult = "";
        String result = instance.getLicense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Pilote.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Pilote instance = new Pilote();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenom method, of class Pilote.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Pilote instance = new Pilote();
        instance.setPrenom(prenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNation method, of class Pilote.
     */
    @Test
    public void testSetNation() {
        System.out.println("setNation");
        String nation = "";
        Pilote instance = new Pilote();
        instance.setNation(nation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLicense method, of class Pilote.
     */
    @Test
    public void testSetLicense() {
        System.out.println("setLicense");
        String license = "";
        Pilote instance = new Pilote();
        instance.setLicense(license);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Pilote.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Pilote instance = new Pilote();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
