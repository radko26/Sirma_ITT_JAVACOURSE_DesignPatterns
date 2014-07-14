package com.sirma.itt.javacourse.designpattern.chain;

/**
 * Class which can handle requests with priority with level 2 or less.
 * 
 * @author radoslav
 */
public class VicePresident extends Approver {

	/**
	 * Initialises the priority level it can handle.
	 */
	public VicePresident() {
		priotiryLevel = 2;
	}

	@Override
	public String processRequest(Request request) {
		if (request.getPriority() > priotiryLevel) {
			return successor.processRequest(request);
		} else {
			return "Handled by the vice";
		}
	}

}
