package com.sirma.itt.javacourse.designpattern.fluent;

import java.util.ArrayList;

/**
 * Creates object which holds information about mail object.
 * 
 * @author radoslav
 */
public class Mail implements MailBuilder {

	private String from;
	private String to;
	private String subject;
	private String content;
	private String cc;
	private ArrayList<Object> attachments = new ArrayList<>();

	@Override
	public MailBuilder from(String adress) {
		this.from = adress;
		return this;
	}

	@Override
	public MailBuilder to(String adress) {
		this.to = adress;
		return this;
	}

	@Override
	public MailBuilder cc(String adress) {
		this.cc = adress;
		return this;
	}

	@Override
	public MailBuilder subject(String subject) {
		this.subject = subject;
		return this;
	}

	@Override
	public MailBuilder attachments(Object... attachment) {
		for (int i = 0; i < attachment.length; i++) {
			attachments.add(attachment[i]);
		}
		return this;
	}

	@Override
	public MailBuilder content(String content) {
		this.content = content;
		return this;
	}

	@Override
	public MailBuilder build() {
		if (from == null) {
			throw new NullPointerException("From field is not valid");
		} else {
			return this;
		}
	}

	/**
	 * Gets the sender.
	 * 
	 * @return The sender.
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Gets the addressee.
	 * 
	 * @return The addressee.
	 * 
	 */
	public String getTo() {
		return to;
	}

	/**
	 * Gets the subject.
	 * 
	 * @return The subject.
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Gets the cc.
	 * 
	 * @return The field value.
	 */
	public String getCc() {
		return cc;
	}

	/**
	 * Gets the content of the mail.
	 * 
	 * @return The content.
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Gets list of attachments.
	 * 
	 * @return The list.
	 */
	public ArrayList<?> getAttachments() {
		return attachments;
	}

}
