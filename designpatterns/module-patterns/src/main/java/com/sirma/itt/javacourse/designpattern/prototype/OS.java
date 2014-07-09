package com.sirma.itt.javacourse.designpattern.prototype;

/**
 * Provides declaration of methods used in the specific operation system.
 * 
 * @author radoslav
 */
public abstract class OS implements Cloneable {
	protected String name;

	/**
	 * Gets the name of the operation system.
	 * 
	 * @return The name of the operation system.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Clones the object.
	 * 
	 * @return The cloned object. {@inheritDoc}
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			throw new CloneNotSupportedException("Cloned not supported");
		}
		return clone;
	}

}
