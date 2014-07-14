package com.sirma.itt.javacourse.designpattern.fluent;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for {@link Mail}.
 * 
 * @author radoslav
 */
public class MailTest {

	/**
	 * Creates object with test values and then compares its output with the
	 * entered.
	 */
	@Test
	public void testBuild() {
		Object[] testArray = new Object[]{new Object(),new Object()};
		Mail mail = (Mail) new Mail().from("Gidon").to("Indilos")
				.subject("TOP SECRET").content("010101110").cc("")
				.attachments(testArray).build();
		
		assertEquals(mail.getFrom(), "Gidon");
		assertEquals(mail.getTo(), "Indilos");
		assertEquals(mail.getSubject(), "TOP SECRET");
		assertEquals(mail.getContent(), "010101110");
		assertEquals(mail.getCc(), "");
		Object[] getArray=mail.getAttachments().toArray();
		assertEquals(testArray[0],getArray[0]);
	}
}
