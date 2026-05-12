package com.mycompany.action_json;

import java.util.Scanner;
import org.json.JSONObject;

public class Action_JSON {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        JSONObject person = new JSONObject();

        System.out.println("=== User Registration ===");

        // Validate name
        String name;
        while (true) {

            System.out.print("Enter name: ");
            name = scanner.nextLine().trim();

            if (!name.isEmpty()) {
                break;
            }

            System.out.println("Name cannot be empty.");
        }

        // Validate age
        int age;

        while (true) {

            System.out.print("Enter age: ");

            if (scanner.hasNextInt()) {

                age = scanner.nextInt();

                if (age > 0 && age < 120) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Age must be between 1 and 119.");
                }

            } else {

                System.out.println("Please enter a valid number.");
                scanner.nextLine();
            }
        }

        // Validate email
        String email;

        while (true) {

            System.out.print("Enter email: ");
            email = scanner.nextLine().trim();

            if (email.contains("@") && email.contains(".")) {
                break;
            }

            System.out.println("Invalid email format.");
        }

        // Dynamic input
        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter occupation: ");
        String occupation = scanner.nextLine();

        // Build JSON object
        person.put("name", name);
        person.put("age", age);
        person.put("email", email);
        person.put("city", city);
        person.put("occupation", occupation);

        // Print JSON
        System.out.println("\nGenerated JSON:");

        System.out.println(person.toString(4));

        scanner.close();
        
    }
}
