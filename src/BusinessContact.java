/**
 * Name: Urzalla Razmowar
 * Course: SDC330L Advanced Object-Oriented Programming Using Java Lab
 * Week: Week 4 Project
 * Assignment: Course Project - Database Implementation
 * Date: 05/09/2026
 * Description: Represents a business contact and extends the Contact class.
 */

public class BusinessContact extends Contact {
    
    private String company;

    public BusinessContact(String name, String phone, String company) {
        super(name, phone);
        this.company = company;
    }

    public BusinessContact() {
        super("Unknown", "000-000-0000");
        this.company = "Unknown";
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + " | Phone: " + phone + " | Company: " + company);
        
    }
}