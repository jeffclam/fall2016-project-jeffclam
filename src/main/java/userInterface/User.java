package userInterface;

import java.util.ArrayList;
import java.util.Collections;

import db.JournalEntry;

public class User {
	private ArrayList<JournalEntry> journalEntries;
	
	public User() {
		journalEntries = new ArrayList<JournalEntry>();
	}
	
	public boolean add(JournalEntry entry) {
		return journalEntries.add(entry);
	}
	
	public JournalEntry remove(int index) {
		return journalEntries.remove(index);
	}
	
	public void sort() {
		Collections.sort(journalEntries);
	}
}