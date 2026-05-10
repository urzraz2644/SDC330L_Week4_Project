/**
 * Name: Urzalla Razmowar
 * Course: SDC330L Advanced Object-Oriented Programming Using Java Lab
 * Week: Week 4 Project
 * Assignment: Course Project - Database Implementation
 * Date: 05/09/2026
 * Description: Handles SQLite database operations for contacts.
 */

import java.sql.*;
import java.util.ArrayList;

public class ContactDB {

    static final String URL = "jdbc:sqlite:contacts.db";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite driver not loaded.");
        }
    }
    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS contacts (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "phone TEXT," +
                "type TEXT)";
        
        try (Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("Database ready.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addContact(String name, String phone, String type) {
        String sql = "INSERT INTO contacts(name, phone, type) VALUES(?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, type);
            pstmt.executeUpdate();
            
            System.out.println("Contact added.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updateContact(int id, String newName) {
    String sql = "UPDATE contacts SET name = ? WHERE id = ?";

    try (Connection conn = DriverManager.getConnection(URL);
        PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, newName);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();

        System.out.println("Contact updated.");

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }    
}

public static void deleteContact(int id) {

    String sql = "DELETE FROM contacts WHERE id = ?";

    try (Connection conn = DriverManager.getConnection(URL);
        PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println("Contact deleted.");

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

}

    public static ArrayList<String> getContacts() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "SELECT * FROM contacts";

        try (Connection conn = DriverManager.getConnection(URL);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String contact = rs.getInt("id") + " | " +
                                 rs.getString("name") + " | " +
                                 rs.getString("phone") + " | " +
                                 rs.getString("type");
            
                list.add(contact);
            }

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

    return list;
}
}