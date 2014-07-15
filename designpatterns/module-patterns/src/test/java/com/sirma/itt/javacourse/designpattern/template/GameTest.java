package com.sirma.itt.javacourse.designpattern.template;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link Game} abstract class.Implements the Template design
 * pattern.
 * 
 * @author radoslav
 */
public class GameTest {

	/**
	 * Creates various games and checks which game has been started.
	 */
	@Test
	public void testPlay() {
		Game game = new Chess();
		assertTrue(game.play() == "Chess game started");
		game = new Football();
		assertTrue(game.play() == "Football game started");
	}
}
