package com.sirma.itt.javacourse.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Executes all commands.
 * 
 * @author radoslav
 */
public class Executor {
	private List<Operation> commands = new ArrayList<Operation>();

	/**
	 * Adds command to the list for executing.
	 * 
	 * @param operation
	 *            The operation which you want to be executed
	 */
	public void takeOperation(Operation operation) {
		commands.add(operation);
	}

	/**
	 * Executes all waiting operations and clear the list.
	 */
	public float[] calculate() {
		float[] answers = new float[commands.size()];
		int i = 0;
		for (Operation operation : commands) {
			answers[i] = operation.compute();
			i++;
		}
		commands.clear();
		return answers;
	}
}
