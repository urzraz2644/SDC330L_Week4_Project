/**
 * Name: Urzalla Razmowar
 * Course: SDC330L Advanced Object-Oriented Programming Using Java Lab
 * Week: Week 4 Project
 * Assignment: Course Project - Database Implementation
 * Date: 05/09/2026
 * Description: Entry point of the application that demonstrates contact management.
 */
public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver loaded successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver NOT loaded.");
        }

        System.out.println("Week 4 Project - Database Implementation");

        ContactDB.createTable();
        ContactDB.addContact("John Doe", "123-456-7890", "Personal");

        System.out.println("Name: Urzalla Razmowar");
        System.out.println("Welcome! This program manages contacts.\n");


        // Create database table
        ContactDB.createTable();

        // Add contacts to database
        ContactDB.addContact("John Doe", "123-456-7890", "Personal");
        ContactDB.addContact("Jane Smith", "987-654-3210", "Business");

        // Update example
        ContactDB.updateContact(1, "Updated Name");

        // Delete example
        ContactDB.deleteContact(2);

        // Displaying contacts from database
        System.out.println("\nDisplaying Contacts:\n");
        for (String contact : ContactDB.getContacts()) {
            System.out.println(contact);
        }
    }
}