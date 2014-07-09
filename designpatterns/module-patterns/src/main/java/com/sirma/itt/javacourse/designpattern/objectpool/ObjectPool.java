package com.sirma.itt.javacourse.designpattern.objectpool;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Using the object pool design pattern, this class saves various objects in a
 * map and let to acquire specific number instances and provides way to release
 * the used memory when the instance is not used.It uses a map with index to the
 * entry and a {@link Triplet} to hold the list of used,the capacity and the
 * unmodified object.
 * 
 * @author radoslav
 * 
 */
public class ObjectPool {
	private static ObjectPool instance = new ObjectPool();
	private Map<String, Triplet<Integer, Queue<Object>, Object>> table = new HashMap<>();

	/**
	 * Disables new instances.
	 */
	private ObjectPool() {
	}

	/**
	 * Gets the {@link ObjectPool} instance.
	 * 
	 * @return The instance.
	 */
	public static ObjectPool getInstance() {
		return instance;
	}

	/**
	 * Adds the desired object to the objectPool.
	 * 
	 * @param key
	 *            The key that index the object.
	 * @param value
	 *            The object.
	 * @param capacity
	 *            The limited times of acquire the object.
	 */
	public void addToMap(String key, Object value, int capacity) {
		Queue<Object> queue = new LinkedList<>();

		table.put(key, new Triplet<Integer, Queue<Object>, Object>(capacity,
				queue, value));
	}

	/**
	 * 
	 * Which class instance you have chosen to acquire.
	 * 
	 * @param key
	 *            The key in the map.
	 * @throws Exception
	 *             If the limit has been reached.
	 */
	public void acquire(String key) throws Exception {
		Triplet<Integer, Queue<Object>, Object> triplet = table.get(key);
		int capacity = triplet.first;
		Queue<Object> queue = triplet.second;
		Object instance = triplet.third;
		if (queue.size() >= capacity) {
			throw new Exception("Cannot acquire more");
		} else {
			queue.add(instance);
			table.replace(key, new Triplet<Integer, Queue<Object>, Object>(
					capacity, queue, instance));
		}
	}

	/**
	 * Free the used instance.
	 * 
	 * @param key
	 *            The index of the object.
	 * @throws Exception
	 *             In case there are no instances for releasing.
	 */
	public void release(String key) throws Exception {
		Triplet<Integer, Queue<Object>, Object> triplet = table.get(key);
		Queue<Object> queue = triplet.second;
		Object instance = triplet.third;
		try {
			queue.remove();
		} catch (Exception e) {
			throw new Exception("Nothing to release");
		}
		table.replace(key,
				new Triplet<Integer, Queue<Object>, Object>(triplet.getFirst(),
						queue, instance));
	}

	/**
	 * Gets the triplet in order to public access to the usage queue.
	 * 
	 * @param key
	 *            The index of the holder.
	 * @return The holder
	 */
	public Triplet<Integer, Queue<Object>, Object> getTriplet(String key) {
		return table.get(key);

	}
}
