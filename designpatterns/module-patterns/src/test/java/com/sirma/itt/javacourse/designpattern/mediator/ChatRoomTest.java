package com.sirma.itt.javacourse.designpattern.mediator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link ChatRoom}.
 * 
 * @author radoslav
 */
public class ChatRoomTest {

	/**
	 * Creates users, send messages and checks the output.
	 */
	@Test
	public void testSendMessage() {
		User me = new User("Radi");
		User you = new User("You");

		assertTrue(me.sendMessage("Hello").contentEquals("Radi said: Hello"));
		assertTrue(you.sendMessage("Hello").contentEquals("You said: Hello"));

	}

}
