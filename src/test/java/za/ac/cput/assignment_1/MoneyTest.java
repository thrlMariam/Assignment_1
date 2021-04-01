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
 * @author Ndumi Gaga
 */
public class MoneyTest {
    
    public static void MoneyTest() 
    {
    }
        
        public Money amount1;
        public Money amount2;
        public Money amount3;
    

    
    @BeforeAll
    public  void setUpClass() {
        amount1 = new Money ();
        amount2 = new Money ();
        amount3 =amount1;
    }

    @Test
    void testIdentity(){
        assertSame(amount1,amount3);
        
    }
    @Test
    void testEquality(){
    assertEquals(amount1,amount3);
}
    
  @Test
  void testEquality2(){
  fail("the test will fail");
  assertEquals(amount1,amount3);
      
  }
   
       
   
   

    /**
     * Test of getMoneyType method, of class Money.
     */
    @Test
    public void testGetMoneyType() {
        System.out.println("getMoneyType");
        Money instance = new Money();
        String expResult = "";
        String result = instance.getMoneyType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMoneyType method, of class Money.
     */
    @Test
    
    public void testSetMoneyType() {
        System.out.println("setMoneyType");
        String moneyType = "";
        Money instance = new Money();
        instance.setMoneyType(moneyType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColour method, of class Money.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        Money instance = new Money();
        String expResult = "";
        String result = instance.getColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColour method, of class Money.
     */
    @Test
    public void testSetColour() {
        System.out.println("setColour");
        String colour = "";
        Money instance = new Money();
        instance.setColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class Money.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Money instance = new Money();
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class Money.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        Money instance = new Money();
        instance.setCountry(country);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Money.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Money instance = new Money();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
