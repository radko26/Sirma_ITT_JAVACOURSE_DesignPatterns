package com.sirma.itt.javacourse.designpattern.filter;

import java.util.ArrayList;

/**
 * Finds the people whom age is equal to the average of the whole group.
 * 
 * @author radoslav
 */
public class AverageAgeCriteria implements Criteria {

	@Override
	public ArrayList<Person> sift(ArrayList<Person> people) {
		ArrayList<Person> result = new ArrayList<>();
		int averageAge = 0;
		for (Person person : people) {
			averageAge += person.getAge();
		}
		averageAge /= people.size();
		for (Person person : people) {
			if (person.getAge() == averageAge) {
				result.add(person);
			}
		}
		return result;
	}

}
