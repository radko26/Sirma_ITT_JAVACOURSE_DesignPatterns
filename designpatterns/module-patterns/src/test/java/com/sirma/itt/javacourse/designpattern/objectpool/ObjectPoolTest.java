package com.sirma.itt.javacourse.designpattern.objectpool;

import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

/**
 * Test class for {@link ObjectPool}.
 * 
 * @author radoslav
 */
public class ObjectPoolTest {

	/**
	 * Checks if it acquires instances.
	 * 
	 * @throws Exception
	 *             When the limit has been reached.
	 */
	@Test
	public void testAcquire() throws Exception {
		ObjectPool.getInstance().addToMap("1", new Integer(5), 2);
		Queue<Object> testQueue = new LinkedList<>();
		testQueue.add(new Integer(5));
		ObjectPool.getInstance().acquire("1");
		assertTrue(testQueue.peek().equals(
				ObjectPool.getInstance().getTriplet("1").getSecond().peek()));
	}

	/**
	 * Checks if frees the instances.
	 * 
	 * @throws Exception
	 *             If the limit has been reached.
	 */
	@Test(expected = Exception.class)
	public void testRelease() throws Exception {
		ObjectPool.getInstance().addToMap("2", new Integer(6), 2);
		ObjectPool.getInstance().acquire("2");
		ObjectPool.getInstance().release("2");
		ObjectPool.getInstance().release("2");
	}

}
