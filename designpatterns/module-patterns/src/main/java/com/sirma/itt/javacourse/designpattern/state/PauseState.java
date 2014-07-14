package com.sirma.itt.javacourse.designpattern.state;

/**
 * Waits until another event happens.
 * 
 * @author radoslav
 */
public class PauseState implements State {

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}

	@Override
	public String getStateName() {
		return "Pause";
	}

}
