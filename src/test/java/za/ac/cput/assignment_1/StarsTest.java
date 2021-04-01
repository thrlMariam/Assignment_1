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
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Tyler Fredericks - 218047894
 */
public class StarsTest
{
    
    private Stars WhiteDwarf;
    private Stars YellowDwarf;
    private Stars Sun;
    
    @BeforeEach
    public void setUp() 
    {
        WhiteDwarf = new Stars();
        YellowDwarf = new Stars();
        Sun = YellowDwarf;
    }

    @Test
    public void ObjectEquality() 
    {
        assertEquals(YellowDwarf, Sun);
    }
    
    @Test
    public void ObjectIdentity() 
    {
        assertSame(WhiteDwarf, YellowDwarf);
    }
    
    @Test
    public void FailingTest()
    {
        if(WhiteDwarf == YellowDwarf) 
        {
            fail("White Dwarf stars and Yellow Dwarf stars are different stars");
        }
    }
    
    @Test
    @Timeout (10)
    public void TimeoutTest() throws InterruptedException 
    {
        while (true)
        {
            Thread.currentThread().sleep(1000);
        }
    }
    
    @Test
    @Disabled
    public void IgnoringObjectEquality() 
    {
        assertEquals(YellowDwarf, Sun);
    }
    
}