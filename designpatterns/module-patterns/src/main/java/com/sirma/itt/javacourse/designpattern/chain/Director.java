package com.sirma.itt.javacourse.designpattern.chain;

/**
 * Class which can handle requests with priority level 1.
 * 
 * @author radoslav
 */
public class Director extends Approver {

	/**
	 * Initialises the priority level it can handle.
	 */
	public Director() {
		priotiryLevel = 1;
	}

	@Override
	public String processRequest(Request request) {
		if (request.getPriority() > priotiryLevel) {
			return successor.processRequest(request);
		} else {
			return "Handled by the director";
		}
	}
}
