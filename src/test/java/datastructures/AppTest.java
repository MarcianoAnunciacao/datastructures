package datastructures;

import static junit.framework.TestCase.assertEquals;

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
        elements = new int[]{1, 2, 3, 4, 5, 6, 7, 2, 8, 55};
    }

    @Test
    public void shouldReturnIndexOfElement(){

        assertEquals(9, LinearSearch.search(elements, 55));
    }

    @Test
    public void shouldReturnIndexOfElementInABinarySearch(){
        assertEquals(1, BinarySearch.binarySearch(elements, 2));
    }
}