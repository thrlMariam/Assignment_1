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
 * @author Lelihle - 214258041
 */
public class MathClassTest {
    private MathClass math1;
    private MathClass math2;
    private MathClass math3;
    
    @BeforeEach
    public void setUp() {
        math1 = new MathClass();
        math2 = new MathClass();
        math3 = math1;
    }
    
    @Test
    public void testEquality() {
        assertEquals(math3, math1);
    }
    
    @Test
    public void testIdentity() {
        assertEquals(math3, math1);
    }
    
    @Test
    public void testFailure() {
        fail("I want this to fail");
    }
    
    @Test
    @Disabled
    public void testDisable() {
        System.out.println("Pointless print");
    }
    
    @Test
    @Timeout(2)
    public void testTimeout() {
    }
}
