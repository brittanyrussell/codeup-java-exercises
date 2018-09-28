package contactsapp;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Methods {

    public static void showAll() {
        try {
            List<String> contacts = Files.readAllLines(Paths.get("src/contactsapp/contacts.txt"));
            System.out.println(contacts.toString());
        } catch (IOException e) {
            System.out.println("Exception!");
            e.printStackTrace();
        }

    }

    public static void addContact() {
        Scanner scan = new Scanner(System.in);
        Path p = Paths.get("src/contactsapp", "contacts.txt");
        String input1;
        System.out.println("Enter the new contact:");
        input1 = scan.nextLine();
        List<String> contacts = new ArrayList<>();
        contacts.add(input1);
        try {
            Files.write(p, contacts, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchContacts() {
        Scanner scan1 = new Scanner(System.in);
        String input2;
        System.out.println("Enter the contact you are looking for: ");
        input2 = scan1.nextLine();
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/contactsapp/contacts.txt"));
            for (String line : lines) {
                if (line.contains(input2)) {
                    System.out.println(line);

                }

//            if (lines.isEmpty()) {
//                System.out.println("Contact doesn't exist.");
//            }
            }
        } catch (IOException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }

    public static void deleteContact() {
        Scanner scan2 = new Scanner(System.in);
        String input3;
        System.out.println("Which contact would you like to delete?");
        input3 = scan2.nextLine();
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/contactsapp/contact.txt"));
            for (String line : lines) {
                if (line.contains(input3)) {

                }
            }
        } catch (IOException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }

    }


}

