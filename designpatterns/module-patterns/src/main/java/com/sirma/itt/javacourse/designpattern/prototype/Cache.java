package com.sirma.itt.javacourse.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds a map with primary objects that will be used afterward for getting
 * their clone.
 * 
 * @author radoslav
 */
public class Cache {
	private static Map<String, OS> cache = new HashMap<>();

	/**
	 * Gets the element with the specific key from the map.
	 * 
	 * @param OSName
	 *            The key by which the objects are reached.
	 * @return The clone of the object..
	 * @throws CloneNotSupportedException
	 *             In case clone method is not supported.
	 */
	public static OS getOS(String OSName) throws CloneNotSupportedException {
		OS cachedOS = cache.get(OSName);
		return (OS) cachedOS.clone();
	}

	/**
	 * Denies instances.
	 */
	private Cache() {
	}

	/**
	 * Loads basic info.
	 */
	public static void loadCache(Map<String, OS> map) {
		cache = map;
	}
}
