package assignment2;

import java.util.*;

public class assignment2 {
    public static void main(String[] args) {
        // Array of employee email IDs
        String[] emails = {
            "sreesh@google.com",
            "tony@hhotmail.com",
            "peter@yahoo.com",
            "parker@outlook.com",
            "reaper@google`.com"
        };
        
        // Get user input for email ID to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email ID to search: ");
        String search = scanner.nextLine();
        
        // Perform search
        boolean found = false;
        for (String email : emails) {
            if (email.equals(search)) {
                found = true;
                break;
            }
        }
        
        // Display search result
        if (found) {
            System.out.println("Email ID found!");
        } else {
            System.out.println("Email ID not found.");
        }
        
        scanner.close();
    }
}
