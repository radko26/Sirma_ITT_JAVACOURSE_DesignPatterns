package com.sirma.itt.javacourse.designpattern.filter;

/**
 * Holds information about someone.
 * 
 * @author radoslav
 */
public class Person {

	private int age;

	/**
	 * Initialises the age via parameter.
	 * 
	 * @param age
	 *            The age of the person.
	 */
	public Person(int age) {
		this.age = age;
	}

	/**
	 * Gets the age.
	 * 
	 * @return The age.
	 */
	public int getAge() {
		return age;
	}
}
