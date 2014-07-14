package com.sirma.itt.javacourse.designpattern.composite;

import java.util.ArrayList;

/**
 * Builds a tree structure of same objects.
 * 
 * @author radoslav
 */
public class SchoolEmployee {

	private String name;
	private String position;
	private ArrayList<SchoolEmployee> subTeachers;

	/**
	 * Initialises the name and the profession of the school employee.
	 * 
	 * @param name
	 *            Name of the employee.
	 * @param position
	 *            Profession name.
	 */
	public SchoolEmployee(String name, String position) {
		this.name = name;
		this.position = position;
		subTeachers = new ArrayList<>();
	}

	/**
	 * Gets all teachers bellow her in the school hierarchy.
	 * 
	 * @return List of teachers.
	 */
	public ArrayList<SchoolEmployee> getSubTeachers() {
		return subTeachers;
	}

	/**
	 * Adds a teacher to the list of sub teachers.
	 * 
	 * @param subTeacher
	 *            The teacher.
	 */
	public void addSubTeacher(SchoolEmployee subTeacher) {
		subTeachers.add(subTeacher);
	}

	/**
	 * Gets the employee's position.
	 * 
	 * @return The position's name.
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * Gets the name of the employee.
	 * 
	 * @return The name of the employee.
	 */
	public String getName() {
		return name;
	}

}
