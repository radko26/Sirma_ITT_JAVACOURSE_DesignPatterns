package com.sirma.itt.javacourse.designpattern.mediator;

/**
 * Defines simplified communication between classes
 * 
 * @author radoslav
 */
public class ChatRoom {
	/**
	 * Works with the data and build an output.
	 * 
	 * @param user
	 *            The user who sends the message.
	 * @param message
	 *            The message.
	 * @return String containing the name and the message.
	 */
	public static String showMessage(User user, String message) {
		return user.getName() + " said: " + message;
	}

}
