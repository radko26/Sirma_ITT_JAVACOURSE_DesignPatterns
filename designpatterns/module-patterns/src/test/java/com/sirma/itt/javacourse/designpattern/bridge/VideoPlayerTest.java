package com.sirma.itt.javacourse.designpattern.bridge;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link VideoPlayer}.
 * 
 * @author radoslav
 */
public class VideoPlayerTest {

	/**
	 * Loads specific player and checks if the player has loaded the correct
	 * specific one.
	 */
	@Test
	public void test() {
		Player testPlayer = new VideoPlayer(new Mp4());
		assertTrue(testPlayer.open().contentEquals("Mp4"));
		testPlayer = new VideoPlayer(new Avi());
		assertTrue(testPlayer.open().contentEquals("Avi"));

	}

}
