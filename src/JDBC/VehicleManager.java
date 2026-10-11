package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class VehicleManager {

  
    private static final String URL = "jdbc:mysql://localhost:3306/sample";
    private static final String USER = "root";
    private static final String PASSWORD = "Nishanth@2312";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) 
        {

            System.out.println("Connected to the database successfully!");
            boolean exit = false;

            while (!exit)
            {
                System.out.println("\n=== VEHICLE CRUD OPERATIONS ===");
                System.out.println("1. Create Vehicle");
                System.out.println("2. Get All Vehicles");
                System.out.println("3. Get Vehicle by ID");
                System.out.println("4. Get Vehicles by Make");
                System.out.println("5. Update Vehicle");
                System.out.println("6. Delete Vehicle");
                System.out.println("7. Exit");
                System.out.print("Enter your choice (1-7): ");

                int choice = scanner.nextInt();
                switch (choice)
                {
                    case 1:
                        createVehicle(conn, scanner);
                        break;
                    case 2:
                        getAllVehicles(conn);
                        break;
                    case 3:
                        getVehicleById(conn, scanner);
                        break;
                    case 4:
                        getVehiclesByMake(conn, scanner);
                        break;
                    case 5:
                        updateVehicle(conn, scanner);
                        break;
                    case 6:
                        deleteVehicle(conn, scanner);
                        break;
                    case 7:
                        exit = true;
                        System.out.println("Exiting application...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 7.");
                }
            }
        } catch (SQLException e) 
        {
            System.err.println("Database error occurred: " + e.getMessage());
        }
    }

    // 1. Create a new vehicle
    private static void createVehicle(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Make: ");
        String make = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        String sql = "INSERT INTO Vehicle (id, Year, model, make) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setInt(2, year);
            pstmt.setString(3, model);
            pstmt.setString(4, make);
            pstmt.executeUpdate();
            System.out.println("Vehicle added successfully!");
        }
    }

    // 2. Get all vehicles
    private static void getAllVehicles(Connection conn) throws SQLException {
        String sql = "SELECT * FROM Vehicle";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            printVehicleResults(rs);
        }
    }

    // 3. Get vehicle by ID
    private static void getVehicleById(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Vehicle ID: ");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM Vehicle WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                printVehicleResults(rs);
            }
        }
    }

    // 4. Get vehicles by Make
    private static void getVehiclesByMake(Connection conn, Scanner scanner) throws SQLException {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Make (e.g., Nissan): ");
        String make = scanner.nextLine();

        String sql = "SELECT * FROM Vehicle WHERE make = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, make);
            try (ResultSet rs = pstmt.executeQuery()) {
                printVehicleResults(rs);
            }
        }
    }

    // 5. Update vehicle
    private static void updateVehicle(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter the ID of the vehicle to update: ");
        int id = scanner.nextInt();
        System.out.print("Enter new Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new Make: ");
        String make = scanner.nextLine();
        System.out.print("Enter new Model: ");
        String model = scanner.nextLine();

        String sql = "UPDATE Vehicle SET Year = ?, make = ?, model = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, year);
            pstmt.setString(2, make);
            pstmt.setString(3, model);
            pstmt.setInt(4, id);
            
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Vehicle updated successfully!");
            } else {
                System.out.println("No vehicle found with the given ID.");
            }
        }
    }

    // 6. Delete vehicle
    private static void deleteVehicle(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter the ID of the vehicle to delete: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM Vehicle WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Vehicle deleted successfully!");
            } else {
                System.out.println("No vehicle found with the given ID.");
            }
        }
    }

    // Helper method to display query results
    private static void printVehicleResults(ResultSet rs) throws SQLException {
        System.out.println("\n------------------------------------------------");
        System.out.printf("%-5s | %-6s | %-15s | %-15s\n", "ID", "Year", "Make", "Model");
        System.out.println("------------------------------------------------");
        
        boolean hasResults = false;
        while (rs.next()) {
            hasResults = true;
            System.out.printf("%-5d | %-6d | %-15s | %-15s\n",
                    rs.getInt("id"),
                    rs.getInt("Year"),
                    rs.getString("make"),
                    rs.getString("model"));
        }
        
        if (!hasResults) {
            System.out.println("No records found.");
        }
        System.out.println("------------------------------------------------\n");
    }
}