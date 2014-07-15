package com.sirma.itt.javacourse.designpattern.template;

/**
 * Defines primary template that unite all types of games.
 * 
 * @author radoslav
 */
public abstract class Game {

	abstract String initGame();

	/**
	 * Start playing the game.
	 * 
	 * @return The game which is currently played.
	 */
	public String play() {
		return initGame();
	}

}
