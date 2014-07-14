package com.sirma.itt.javacourse.designpattern.mediator;

/**
 * Defines class that contains information about an user.
 * 
 * @author radoslav
 */
public class User {

	private String name;

	/**
	 * Initialises the name.
	 * 
	 * @param name
	 *            The name.
	 */
	public User(String name) {
		this.name = name;
	}

	/**
	 * Gets the name of the user.
	 * 
	 * @return His name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Send message to the {@link ChatRoom} class which process it.
	 * 
	 * @param message
	 *            The message.
	 * @return The modified message.
	 */
	public String sendMessage(String message) {
		return ChatRoom.showMessage(this, message);
	}

}
