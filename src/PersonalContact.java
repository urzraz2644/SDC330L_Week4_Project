/**
 * Name: Urzalla Razmowar
 * Course: SDC330L Advanced Object-Oriented Programming Using Java Lab
 * Week: Week 4 Project
 * Assignment: Course Project - Database Implementation
 * Date: 05/09/2026
 * Description: Represents a personal contact and extends the Contact class.
 */

public class PersonalContact extends Contact {

    public PersonalContact(String name, String phone) {
        super(name, phone);
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + " | Phone: " + phone);
    }
}
