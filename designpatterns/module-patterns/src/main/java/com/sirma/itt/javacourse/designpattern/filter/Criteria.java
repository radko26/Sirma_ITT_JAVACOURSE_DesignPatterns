package com.sirma.itt.javacourse.designpattern.filter;

import java.util.ArrayList;

/**
 * Interface which provides method for distinguishing and separating elements by
 * a given criteria.
 * 
 * @author radoslav
 */
public interface Criteria {
	/**
	 * Sifts the information.
	 * 
	 * @return List with the results.
	 */
	public ArrayList<Person> sift(ArrayList<Person> people);
}
