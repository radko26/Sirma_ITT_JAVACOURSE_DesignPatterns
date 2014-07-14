package com.sirma.itt.javacourse.designpattern.interpreter;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test class for Interpreter design pattern.
 * 
 * @author radoslav
 */
public class InterpreterTest {

	/**
	 * Assign rules and test the result.
	 */
	@Test
	public void test() {
		
		Expression firstMale=new TerminalExpression("Sanko");
		Expression secondMale=new TerminalExpression("Banko");
		Expression isMale=new OrExpression(firstMale,secondMale);
		Expression andMale=new AndExpression(firstMale,secondMale);
		
		assertTrue(isMale.interpret("Sanko"));
		assertTrue(isMale.interpret("Banko"));
		
		assertTrue(andMale.interpret("Sanko & Banko"));
		
		Expression firstFemale = new TerminalExpression("Lia");
		Expression maleAndFemale=new AndExpression(firstFemale, isMale);
		assertTrue(maleAndFemale.interpret("Lia Sanko"));
	}

}
