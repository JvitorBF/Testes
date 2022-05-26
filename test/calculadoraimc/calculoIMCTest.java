/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author João Vitor
 */
public class calculoIMCTest {

    public calculoIMCTest() {
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
     * Test of imc method, of class calculoIMC.
     */
    @Test
    public void testImc_double() {        
        System.out.println("imc");
        double imc = 18.5;
        calculoIMC instance = new calculoIMC();
        String expResult = "Magreza";
        String result = instance.imc(imc);
        assertEquals(expResult, result);
        System.out.println("Esperado: " + expResult);
        System.out.println("Resultado: " + result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of imc method, of class calculoIMC.
     */
    @Test
    public void testImc_3args() {
        System.out.println("");
        System.out.println("imc");        
        double altura = 1.76;
        int peso = 86;
        calculoIMC instance = new calculoIMC();
        double expResult = 27.76;
        double result = instance.imc(altura, peso);
        assertEquals(expResult, result, 0.01);
       System.out.println("Esperado: " + expResult);
        System.out.println("Resultado: " + result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
