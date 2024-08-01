import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CreateDB {

    public static void main(String[] args) {
        try {
            // MySQL connection URL
            String url = "jdbc:mysql://localhost:3306/";
            // Database name
            String databaseName = "DemoDB";
            // MySQL username
            String username = "root";
            // MySQL password
            String password = "root";

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create statement
            Statement statement = connection.createStatement();

            // SQL command to create database
            String sql = "CREATE DATABASE " + databaseName;

            // Execute the SQL command
            statement.executeUpdate(sql);

            // Show success message
            JOptionPane.showMessageDialog(null, "Database " + databaseName + " created successfully!");

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error creating database: " + e.getMessage());
        }
    }
}
