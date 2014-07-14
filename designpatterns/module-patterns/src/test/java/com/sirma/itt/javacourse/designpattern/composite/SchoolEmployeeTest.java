package com.sirma.itt.javacourse.designpattern.composite;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link SchoolHierarchy}.
 * 
 * @author radoslav
 */
public class SchoolEmployeeTest {
	/**
	 * Builds a hierarchy tree and checks if it has been built properly.
	 */
	@Test
	public void testAdd() {
		SchoolEmployee headmaster = new SchoolEmployee("Isabela", "headmaster");
		SchoolEmployee mathTeacher = new SchoolEmployee("Marabela",
				"maths teacher");

		headmaster.addSubTeacher(mathTeacher);
		assertTrue(headmaster.getSubTeachers().get(0).getName()
				.contentEquals("Marabela")
				&& headmaster.getSubTeachers().get(0).getPosition()
						.contentEquals("maths teacher"));
	}

}
