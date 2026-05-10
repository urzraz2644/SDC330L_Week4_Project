/**
 * Name: Urzalla Razmowar
 * Course: SDC330L Advanced Object-Oriented Programming Using Java Lab
 * Week: Week 4 Project
 * Assignment: Course Project - Database Implementation
 * Date: 05/09/2026
 * Description: Manages contact operations such as adding, removing, and searching.
 */
import java.util.ArrayList;

public class ContactManager {
    private ArrayList<DisplayInterface> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }
    
    public void addContact(DisplayInterface contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (DisplayInterface c : contacts) {
            c.display();
        }
    }
}
