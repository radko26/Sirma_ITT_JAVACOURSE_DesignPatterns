package com.sirma.itt.javacourse.designpattern.adapter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link BasicPlayer}.
 * 
 * @author radoslav
 */
public class BasicPlayerTest {
	/**
	 * Tries to run some video formats and compares which player starts playing
	 * it.
	 */
	@Test
	public void testPlay() {
		BasicPlayer player = new BasicPlayer();
		assertTrue(player.play(".avi").contentEquals("BasicPlayer"));
		assertTrue(player.play(".vlc").contentEquals("VLCPlayer"));
		assertTrue(player.play(".mpc").contentEquals("MPCPlayer"));
	}
}
