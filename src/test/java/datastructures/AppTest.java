package datastructures;

import static junit.framework.TestCase.assertEquals;

import datastructures.recursion.Recursion;
import datastructures.searching.binarysearch.BinarySearch;
import datastructures.searching.linearsearch.LinearSearch;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private int [] elements;

    @Before
    public void insertElementsInArray(){
        elements = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 8, 9, 10, 11, 12, 13, 14,15,16,17,18,19,20};
    }

    @Test
    public void shouldReturnIndexOfElement(){

        assertEquals(9, LinearSearch.search(elements, 55));
    }

    @Test
    public void shouldReturnIndexOfElementInABinarySearch(){
        assertEquals(1, BinarySearch.binarySearch(elements, 2));
    }

    @Test
    public void testRecursion(){
        Recursion.reduceByOne(10);

        assertEquals(-1, Recursion.reduce);
    }

    @Test
    public void testRecursiveLinearSearch(){
        assertEquals(-1, Recursion.recursiveLinearSearch(2, 0, elements));
    }

    @Test
    public void testRecursiveBinarySearch(){
        assertEquals(2, Recursion.recursiveBinarySearch(0, 20, 8, elements));
    }

    @Test
    public void testFibonacciRecursion(){
        assertEquals(5, Recursion.fibonacci(5));
        assertEquals(5, Recursion.fibonacci2(5));
    }
}