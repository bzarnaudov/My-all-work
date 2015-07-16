package stacksAndQueues;

import java.util.Date;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class Problem4ArrayBasedStackUnitTests {

	@Test
    public void testPushPopElement() {
		Problem3ArrayBasedStack<Integer> stack = new Problem3ArrayBasedStack<Integer>();
		assertEquals(0, stack.count());
		stack.push(5);
		assertEquals(1, stack.count());
		int popedElement = stack.pop();
		assertEquals(popedElement, 5);
		assertEquals(0, stack.count());
    }
	
	@Test
    public void testPushPop1000Elements() {
		Problem3ArrayBasedStack<String> stack = new Problem3ArrayBasedStack<String>();
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
		Problem3ArrayBasedStack<String> stack = new Problem3ArrayBasedStack<String>();		
		
		thrown.expect( NoSuchElementException.class );
		thrown.expectMessage("Stack is empty");
		stack.pop();
	}
	
	@Test
	public void testPushPopWithInitialCapacity() {
		Problem3ArrayBasedStack<Integer> stack = new Problem3ArrayBasedStack<Integer>(1);		
		assertEquals(0, stack.count());
		stack.push(5);
		assertEquals(1, stack.count());
		stack.push(15);
		assertEquals(2, stack.count());
		int popedElement = stack.pop();
		assertEquals(popedElement, 15);
		assertEquals(1, stack.count());
		popedElement = stack.pop();
		assertEquals(popedElement, 5);
		assertEquals(0, stack.count());
	}
	
	@Test
	public void testToArray() {
		Problem3ArrayBasedStack<Integer> stack = new Problem3ArrayBasedStack<Integer>();		
		stack.push(3);
		stack.push(5);
		stack.push(-2);
		stack.push(7);
	    Object[] array =  stack.toArray();
		assertEquals(7, array[3]);
		assertEquals(-2, array[2]);
		assertEquals(5, array[1]);
		assertEquals(3, array[0]);
	}
	
	@Test
	public void testEmptyStackToArray() {
		Problem3ArrayBasedStack<Date> stack = new Problem3ArrayBasedStack<Date>();		
		Date[] array =  stack.toArray();
		assertArrayEquals( null, array);
	}
}
