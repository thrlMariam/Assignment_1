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
 * @author Rhegan
 */
public class pet_parlourTest {
    private pet_parlour petIn;
    private pet_parlour petOut;
    private pet_parlour Balance;

    @BeforeEach
    public void setUp() {
        petIn = new pet_parlour();
        petOut = petIn;
        Balance = new pet_parlour();
    }
    
    @Test
    @Timeout(2)
    public void testIdentity() {
        assertSame(petOut, petIn);
    }
    
    @Disabled("Disabled until system is fully operational.")
    @Test
    public void testEquals() {
        fail("Deliberately set to fail");
        assertEquals(petIn, petOut);
    }
}