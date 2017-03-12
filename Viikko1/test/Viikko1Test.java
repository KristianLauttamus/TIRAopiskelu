/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import viikko1.Queue;
import viikko1.Stack;
import viikko1.BinarySearch;

/**
 *
 * @author Kristian Lauttamus
 */
public class Viikko1Test {
    /**
     * Queue
     */
    @Test
    public void enqueue_works(){
        Queue queue = new Queue(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        assertEquals(3, queue.getSize());
    }
    
    @Test
    public void enqueue_and_dequeue_works(){
        Queue queue = new Queue(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        
        assertEquals(0, queue.getSize());
    }
    
    /**
     * Stack
     */
    @Test
    public void push_works(){
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        assertEquals(3, stack.getSize());
    }
    
    @Test
    public void push_and_pop_works(){
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        
        assertEquals(0, stack.getSize());
    }
    
    /**
     * Binary Search
     */
    @Test
    public void searching_items_that_are_in_the_array_works(){
        int[] numbers = new int[]{
            0,1,2,3,4,5,6,7,8,9,10
        };
        
        BinarySearch binarySearch = new BinarySearch(numbers);
        assertTrue(binarySearch.search(0));
        assertTrue(binarySearch.search(10));
        assertTrue(binarySearch.search(5));
        assertTrue(binarySearch.search(4));
    }
    
    @Test
    public void searching_items_that_are_not_in_the_array_works(){
        int[] numbers = new int[]{
            0,1,2,-8,4,5,5,7,8,9,10
        };
        
        BinarySearch binarySearch = new BinarySearch(numbers);
        assertFalse(binarySearch.search(3));
        assertFalse(binarySearch.search(6));
        assertFalse(binarySearch.search(11));
        assertFalse(binarySearch.search(-1));
    }
}
