package com.sirma.itt.javacourse.designpattern.chain;

/**
 * Class which can handle requests with priority level 3 or less.
 * 
 * @author radoslav
 */
public class President extends Approver {

	/**
	 * Initialises the priority level it can handle.
	 */
	public President() {
		priotiryLevel = 3;
	}

	@Override
	public String processRequest(Request request) {
		if (request.getPriority() > priotiryLevel) {
			return "The CEO is not here";
		} else {
			return "Handled by the president";
		}
	}

}
