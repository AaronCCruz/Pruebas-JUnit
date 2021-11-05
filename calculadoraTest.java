
package clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aaron
 */
public class calculadoraTest {
    
    public calculadoraTest() {
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
     * Test of sumar method, of class calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 3;
        int b = 4;
        calculadora instance = new calculadora();
        int expResult = 8;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of restar method, of class calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 8;
        int b = 4;
        calculadora instance = new calculadora();
        int expResult = 4;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of multiplicar method, of class calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 3;
        int b = 5;
        calculadora instance = new calculadora();
        int expResult = 14;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of dividir method, of class calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 4;
        int b = 2;
        calculadora instance = new calculadora();
        int expResult = 2;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    
}
