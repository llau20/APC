package a3;

import java.util.ArrayList;

public class Inbox {
	// store all emails
	private ArrayList<Mail> emails = new ArrayList<>();
	
	public ArrayList<Mail> getEmails() {
		return emails;
	}
	public void setEmails(ArrayList<Mail> emails) {
		this.emails = emails;
	}
	public void store(Mail mail) {
		emails.add(mail);
	}
	public void print() {
		for (int i = 0; i < emails.size(); i++) {
			System.out.println(emails.get(i).isRead() + " | " + emails.get(i).getSubject() + " | " + emails.get(i).getSenderAddress() + " | " + emails.get(i).getDatetime());
		}
	}
	
	public void open(int index) {
		if(index >= 0 && index < emails.size()) {
			Mail mail = emails.get(index);
			mail.markAsRead();
			System.out.println( mail);
		}
	}
	
	public int countUnread() {
		int unread = 0;
		for (int i = 0; i < emails.size(); i++) {
			if(!emails.get(i).isRead()) {
				unread++;
			}
		}
		
		return unread;
	}
}
