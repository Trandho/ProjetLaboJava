/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import projet.Course;
import projet.Pilote;

/**
 *
 * @author Trando
 */
public class CourseTest {
    
    public CourseTest() {
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
     * Test of getVille method, of class Course.
     */
    @Test
    public void testGetVille() {
        System.out.println("getVille");
        Course instance = new Course();
        String expResult = "";
        String result = instance.getVille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPays method, of class Course.
     */
    @Test
    public void testGetPays() {
        System.out.println("getPays");
        Course instance = new Course();
        String expResult = "";
        String result = instance.getPays();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKm method, of class Course.
     */
    @Test
    public void testGetKm() {
        System.out.println("getKm");
        Course instance = new Course();
        double expResult = 0.0;
        double result = instance.getKm();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdre method, of class Course.
     */
    @Test
    public void testGetOrdre() {
        System.out.println("getOrdre");
        Course instance = new Course();
        int expResult = 0;
        int result = instance.getOrdre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParticipant method, of class Course.
     */
    @Test
    public void testGetParticipant() {
        System.out.println("getParticipant");
        Course instance = new Course();
        List<Pilote> expResult = null;
        List<Pilote> result = instance.getParticipant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVille method, of class Course.
     */
    @Test
    public void testSetVille() {
        System.out.println("setVille");
        String ville = "";
        Course instance = new Course();
        instance.setVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPays method, of class Course.
     */
    @Test
    public void testSetPays() {
        System.out.println("setPays");
        String pays = "";
        Course instance = new Course();
        instance.setPays(pays);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKm method, of class Course.
     */
    @Test
    public void testSetKm() {
        System.out.println("setKm");
        double km = 0.0;
        Course instance = new Course();
        instance.setKm(km);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrdre method, of class Course.
     */
    @Test
    public void testSetOrdre() {
        System.out.println("setOrdre");
        int ordre = 0;
        Course instance = new Course();
        instance.setOrdre(ordre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParticipant method, of class Course.
     */
    @Test
    public void testSetParticipant() {
        System.out.println("setParticipant");
        List<Pilote> participant = null;
        Course instance = new Course();
        instance.setParticipant(participant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajoutParticipant method, of class Course.
     */
    @Test
    public void testAjoutParticipant() {
        System.out.println("ajoutParticipant");
        Pilote p = null;
        Course instance = new Course();
        String expResult = "";
        String result = instance.ajoutParticipant(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = new Course();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
