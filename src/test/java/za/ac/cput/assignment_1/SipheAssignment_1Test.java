/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author SIPHE FUNDA
 */
public class SipheAssignment_1Test {
    private static int addition(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private SipheAssignment_1Test  Calculte;
    
    public SipheAssignment_1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
   
    @Test
    public void testSubraction() {
        System.out.println("Maltiplication");
        int a = 0;
        int b = 0;
        SipheAssignment_1 instance = new SipheAssignment_1();
        int expResult = 0;
        int result = instance.Maltiplication(a, b);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    @Test
    
     public void Maltiplication(){
    int result=SipheAssignment_1Test.addition(7, 3);
    assertEquals(10, result);
     }

    private void assertEquals(int i, int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fail(String the_test_case_is_a_prototype) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(int i, int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}

