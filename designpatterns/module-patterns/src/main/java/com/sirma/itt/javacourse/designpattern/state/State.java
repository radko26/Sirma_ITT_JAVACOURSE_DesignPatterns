package com.sirma.itt.javacourse.designpattern.state;

/**
 * Defines an interface for encapsulating the behaviour associated with a
 * particular state of the {@link Context}.
 * 
 * @author radoslav
 */
public interface State {
	/**
	 * New behaviour implementation.
	 * 
	 * @param context
	 *            The particular context.
	 */
	public void doAction(Context context);

	/**
	 * Gets the name of the state.
	 * 
	 * @return The state's name.
	 */
	public String getStateName();
}
