package com.sirma.itt.javacourse.designpattern.state;

/**
 * State that gives the beginning of something.
 * 
 * @author radoslav
 */
public class StartState implements State {

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}

	@Override
	public String getStateName() {
		return "Start";
	}

}
