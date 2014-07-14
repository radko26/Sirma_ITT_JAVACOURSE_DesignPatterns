package com.sirma.itt.javacourse.designpattern.fluent;

/**
 * Provides abstract basic methods related with Mail object.
 * 
 * @author radoslav
 */
public interface MailBuilder {
	/**
	 * Sets the address of the sender.
	 * 
	 * @param adress
	 *            The address of the sender.
	 * @return Instance of the object with filled field.
	 */
	public MailBuilder from(String address);

	/**
	 * Sets the address of the addressee.
	 * 
	 * @param adress
	 *            The address.
	 * @return Instance of the object with filled field.
	 */
	public MailBuilder to(String address);

	/**
	 * Sets the topic of the mail.
	 * 
	 * @param subject
	 *            The topic.
	 * @return Instance of the object with filled field.
	 */

	public MailBuilder subject(String subject);

	/**
	 * Sets mail's content.
	 * 
	 * @param content
	 *            The body of the mail.
	 * @return Instance of the object with filled field.
	 */
	public MailBuilder content(String content);

	/**
	 * Sets the address of someone who will receive a copy of the mail.
	 * 
	 * @param adress
	 *            The address
	 * @return Instance of the object with filled field.
	 */
	public MailBuilder cc(String address);

	/**
	 * Attach objects to the mail.
	 * 
	 * @param attachments
	 *            List with all the objects.
	 * @return Instance of the object with filled field.
	 */
	public MailBuilder attachments(Object... attachment);

	/**
	 * Gets the instance of the object which values were filled in.
	 * 
	 * @return The object.
	 */
	public MailBuilder build();
}
