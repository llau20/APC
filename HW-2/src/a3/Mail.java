package a3;

import java.time.LocalDateTime;

public class Mail {
	private String senderAddress;
	private String subject;
	private String message;
	private LocalDateTime datetime;
	private boolean read;
	
	public Mail(String senderAddress, String subject, String message) {
		this.senderAddress = senderAddress;
		this.subject = subject;
		this.message = message;
		this.datetime = LocalDateTime.now();
		this.read = false;
	}
	
	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public void markAsRead() {
		if (!read) {
			read = true;
		}
	}
	
	@Override
	public String toString() {
		return subject + " from " + senderAddress + " on " + datetime + ": " + message + ".";
		
	}
}
