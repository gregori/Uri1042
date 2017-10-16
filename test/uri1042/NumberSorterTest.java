/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1042;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rodrigo
 */
public class NumberSorterTest {

    /**
     * Test of sort method, of class NumberSorter.
     */
    @Test
    public void testSort1() {
        System.out.println("sort 7 21 -14");
        NumberSorter instance = new NumberSorter(7, 21, -14);
        int[] expResult = {-14, 7, 21};
        int[] result = instance.sort();
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testSort2() {
        System.out.println("sort -14 21 7");
        NumberSorter instance = new NumberSorter(-14, 21, 7);
        int[] expResult = {-14, 7, 21};
        int[] result = instance.sort();
        assertArrayEquals(expResult, result);
    }
    
}
