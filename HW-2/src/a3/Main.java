package a3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inbox inbox = new Inbox();

        // Add some emails
        Mail mail1 = new Mail("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow at 10 AM.");
        Mail mail2 = new Mail("bob@example.com", "Lunch?", "Want to grab lunch today?");
        Mail mail3 = new Mail("carol@example.com", "Project Update", "Here's the latest version of the report.");

        inbox.store(mail1);
        inbox.store(mail2);
        inbox.store(mail3);

        // Print number of unread emails
        System.out.println("Unread emails: " + inbox.countUnread());

        // Open one of the emails
        inbox.open(1);  // Opens email from Bob

        // Print updated unread count
        System.out.println("Unread emails after opening one: " + inbox.countUnread());

        // Print all emails summary
        System.out.println("\nInbox Summary:");
        inbox.print();

	}

}
