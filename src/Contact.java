/**
 * Name: Urzalla Razmowar
 * Course: SDC330L Advanced Object-Oriented Programming Using Java Lab
 * Week: Week 4 Project
 * Assignment: Course Project - Database Implementation
 * Date: 05/09/2026
 * Description: Base class representing a contact.
 */

public abstract class Contact implements DisplayInterface {
    
    protected String name;
    protected String phone;

    // Constructor
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Abstract method 
    public abstract void display(); 
}
