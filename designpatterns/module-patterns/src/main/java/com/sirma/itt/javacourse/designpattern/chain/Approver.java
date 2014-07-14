package com.sirma.itt.javacourse.designpattern.chain;

/**
 * Abstract class which creates the base of all approvers.
 * 
 * @author radoslav
 */
public abstract class Approver {

	protected Approver successor;
	protected int priotiryLevel;

	/**
	 * Sets the successor who can process requests with higher priority level.
	 * 
	 * @param successor
	 *            The successor.
	 */
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	/**
	 * Takes the request and tries consequently approvers from the chain to
	 * process it.
	 * 
	 * @param request
	 *            The request.
	 * @return Who has processed the request.
	 */
	public abstract String processRequest(Request request);
}
