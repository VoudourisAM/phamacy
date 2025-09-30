import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {;        
        
        String cat = "SELECT * FROM Categories"; // τράβα όλες τις κατηγορίες
        String products = "SELECT * FROM Drugs d JOIN Categories c on d.category_id = c.id WHERE c.name = Vitamin"; // τράβα όλα τα προιόντα

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(cat)) {

            System.out.println("--- Categories ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + ") " + name);
            }
            

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Δημιουργία αντικειμένου Category
        //Category[] categories = {
        //    new Category(1, "Antibiotics"),
        //    new Category(2, "Painkillers"),
        //    new Category(3, "Vitamin")
        //};

        //System.out.println("--- Categories ---");
        //for (Category c : categories) {
        //    System.out.println(c.getId() + ") " + c.getName());
        //}

        // Δημιουργία αντικειμένου Drug
        //Drug[] drugs = {
        //    new Drug(1, "Amoxicillin", categories[0], 50, "A2050"),
        //    new Drug(2, "Paracetamol", categories[1], 100, "B3071"),
        //    new Drug(3, "Vitamin C", categories[2], 200, "F5050"),
        //    new Drug(4, "Vitamin B", categories[2], 35, "H2031"),
        //};

        //System.out.println("\n--- Drug ---");
        //for (Drug d : drugs) {
        //    System.out.println(d.getId() + ") " + " (" + d.getCategory().getName() + ") " + d.getName() +  " - Stock: " + d.getStock()  +  " - Code: " + d.getCode());
        //}

        // Show movements
        //Movement[] movements = {
        //    new Movement(drugs[0], 20, LocalDate.of(2025, 9, 28)),  // εισαγωγή
        //    new Movement(drugs[1], -10, LocalDate.of(2025, 9, 28)), // εξαγωγή            
        //    new Movement(drugs[2], 15, LocalDate.of(2025, 10, 15)),  // εισαγωγή
        //    new Movement(drugs[3], -5, LocalDate.of(2025, 10, 15)) // εξαγωγή
        //};

        //System.out.println("\n--- Movements ---");
        //for (Movement m : movements) {
        //    System.out.println(m);
        //}

        // Show updated stock
        //System.out.println("\n--- Updated Stock ---");
        //for (Drug d : drugs) {
        //    System.out.println(d);
        //}

    }

}