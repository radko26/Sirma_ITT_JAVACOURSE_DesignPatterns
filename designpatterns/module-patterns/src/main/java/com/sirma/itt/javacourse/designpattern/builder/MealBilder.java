package com.sirma.itt.javacourse.designpattern.builder;

/**
 * Adds products to meal container.
 * 
 * @author radoslav
 */
public class MealBilder {
	/**
	 * Creates a meal object which contains tuna sandwich and orange juice.
	 * 
	 * @return The packed meal.
	 */
	public Meal purachaseTunaMeal() {
		Meal meal = new Meal();
		meal.addItem(new TunaSandwich());
		meal.addItem(new OrangeJuice());
		return meal;
	}

	/**
	 * Creates a meal object that contains cheese sandwich and orange juice
	 * 
	 * @return The packed meal;
	 */
	public Meal purachaseCheeseMeal() {
		Meal meal = new Meal();
		meal.addItem(new CheeseSandwich());
		meal.addItem(new OrangeJuice());
		return meal;
	}
}
