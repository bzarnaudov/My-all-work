package stacksAndQueues;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Problem6LinkedStackUnitTests {
	@Test
    public void testPushPopElement() {
		Problem5LinkedStack<Integer> stack = new Problem5LinkedStack<Integer>();
		assertEquals(0, stack.count());
		stack.push(5);
		assertEquals(1, stack.count());
		int popedElement = stack.pop();
		assertEquals(popedElement, 5);
		assertEquals(0, stack.count());
    }
	
	@Test
    public void testPushPop1000Elements() {
		Problem5LinkedStack<String> stack = new Problem5LinkedStack<String>();
		assertEquals(0, stack.count());
		for (int i = 1; i <= 1000; i++) {
			stack.push("patka" + i);
			assertEquals(i, stack.count());
		}
		String popedElement;
		for (int i = 1000; i >= 1; i--) {
			popedElement = stack.pop();
			assertEquals(popedElement, "patka" + i);
			assertEquals(i-1, stack.count());
		}
	}
	
	@Rule public ExpectedException thrown= ExpectedException.none();
	@Test
	public void testPopFromEmptyStack() {
		Problem5LinkedStack<String> stack = new Problem5LinkedStack<String>();		
		
		thrown.expect( NoSuchElementException.class );
		thrown.expectMessage("Stack is empty");
		stack.pop();
	}
		
	@Test
	public void testToArray() {
		Problem5LinkedStack<Integer> stack = new Problem5LinkedStack<Integer>();		
		stack.push(3);
		stack.push(5);
		stack.push(-2);
		stack.push(7);
	    Object[] arrayFromStack =  stack.toArray();
	    Integer[] array = { 7, -2, 5, 3};
	    assertArrayEquals( array, arrayFromStack);
	}
	
	@Test
	public void testEmptyStackToArray() {
		Problem5LinkedStack<Date> stack = new Problem5LinkedStack<Date>();		
		Date[] array =  stack.toArray();
		assertArrayEquals( null, array);
	}
}
