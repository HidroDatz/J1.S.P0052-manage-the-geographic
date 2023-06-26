/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0052;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class J1SP0052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Enter country information");
            System.out.println("2. Display country information");
            System.out.println("3. Search country by name");
            System.out.println("4. Display information sorted by country name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch (choice) {
                case 1:
                    manager.enterCountryInformation();
                    break;
                case 2:
                    manager.displayCountryInformation();
                    break;
                case 3:
                    System.out.print("Enter country name to search: ");
                    String name = scanner.nextLine();
                    manager.searchCountryByName(name);
                    break;
                case 4:
                    manager.displaySortedByCountryName();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 5);
    }
}
