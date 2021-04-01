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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Mariaam
 */
public class CampusTest {
    private Campus campus1;
    private Campus campus2;
    private Campus campus3;
    
    
    
    @BeforeEach
    public void setUp() {
        campus1=new Campus();
        campus2=new Campus();
        campus3=campus1;
               
    }
    
   @Test
   public void testIdentity(){
       assertSame(campus1,campus3);
   }
   @Test
   public void testEquality(){
       assertEquals(campus1,campus3);
   }
    /**
     * Test of getStudentname method, of class Campus.
     */
    @Test
    public void testGetStudentname() {
        System.out.println(" Get student name: ");
        String expResult = "Sam";
        campus1.setStudentname("Sam");
        String result = campus1.getStudentname();
        assertEquals(expResult, result);
        
        fail("Fail this test");
    }

   @Test
   public void Timeout(){
       System.out.println("Timeout");
   }
   
   @Test
   @Disabled
   public void testDisabled(){
   fail("fail this test, if not disable") ;   
   }
}
