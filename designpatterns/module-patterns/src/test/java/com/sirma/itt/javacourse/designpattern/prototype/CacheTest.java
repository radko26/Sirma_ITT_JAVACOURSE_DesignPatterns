package com.sirma.itt.javacourse.designpattern.prototype;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * 
 * @author radoslav
 */
public class CacheTest {
	private Map<String, OS> map = new HashMap<String, OS>();
	private Linux linux = new Linux();
	private Windows win = new Windows();
	private Mac mac = new Mac();

	/**
	 * Initialises the cache map.
	 * 
	 * @return
	 */
	@Before
	public void init() {
		map.put(win.getName(), win);
		map.put(linux.getName(), linux);
		map.put(mac.getName(), mac);
	}

	/**
	 * Load the test map into the cache and then gets each type of OS and
	 * compare it with the test map object.
	 * 
	 * @throws CloneNotSupportedException
	 */
	@Test
	public void test() throws CloneNotSupportedException {
		Cache.loadCache(map);

		OS clone = Cache.getOS("Linux");
		assertTrue(clone.getName().contentEquals(linux.getName()));
		clone = Cache.getOS("Windows");
		assertTrue(clone.getName().contentEquals(win.getName()));
		clone = Cache.getOS("Mac");
		assertTrue(clone.getName().contentEquals(mac.getName()));

	}

}
