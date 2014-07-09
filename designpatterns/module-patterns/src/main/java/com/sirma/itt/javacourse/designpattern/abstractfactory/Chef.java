package com.sirma.itt.javacourse.designpattern.abstractfactory;

import java.lang.reflect.Constructor;

/**
 * Constructs a new dish, which depends on the order.
 * 
 * @author radoslav
 */
public abstract class Chef {
	/**
	 * Orders the creation of ice-cream object.
	 * 
	 * @param type
	 *            The type of ice-cream.
	 * @return The ice-cream.
	 */
	abstract IceCream getIceCream(String type);

	/**
	 * Orders the creation of sandwich
	 * 
	 * @param type
	 *            The type of the sandwich.
	 * @return The sandwich.
	 */
	abstract Sandwich getSandwich(String type);

	/**
	 * Creates new instance of the className object using reflection.
	 * 
	 * @param className
	 *            The name of the class which will be instanced.
	 * @return The instance.
	 * @throws ClassNotFoundException
	 *             When the input does not represent correct name.
	 */
	public Object createByReflection(String className)
			throws ClassNotFoundException {
		Class<?> instancedType;
		Object instanceObject;
		try {
			instancedType = Class.forName(className);
			Constructor<?> constructor = instancedType.getConstructor();
			instanceObject = constructor.newInstance();
		} catch (Exception e) {
			throw new ClassNotFoundException("Enter the correct path");
		}
		return instanceObject;
	}
}
