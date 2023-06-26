/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0052;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManageEastAsiaCountries {
     private ArrayList<EastAsiaCountries> countries;

    public ManageEastAsiaCountries() {
        countries = new ArrayList<>();
    }

    // Add information for 11 countries in Southeast Asia
    public void enterCountryInformation() {
            Scanner scanner = new Scanner(System.in);
    String choice;

    do {
        System.out.println("Enter information for a country");
        System.out.print("Country Code: ");
        String countryCode = scanner.nextLine();
        System.out.print("Country Name: ");
        String countryName = scanner.nextLine();
        System.out.print("Total Area: ");
        float totalArea = Float.parseFloat(scanner.nextLine());
        System.out.print("Country Terrain: ");
        String countryTerrain = scanner.nextLine();

        EastAsiaCountries country = new EastAsiaCountries(countryCode, countryName, totalArea, countryTerrain);
        countries.add(country);

        if (countries.size() == 11) {
            break;
        }

        System.out.print("Do you want to add another country? (Y/N): ");
        choice = scanner.nextLine();
        System.out.println();
    } while (choice.equalsIgnoreCase("Y"));
    }
     public void displayCountryInformation() {
        for (EastAsiaCountries country : countries) {
            country.display();
            System.out.println();
        }
    }

    // Search for a country by name
    public void searchCountryByName(String name) {
        for (EastAsiaCountries country : countries) {
            if (country.getCountryName().equalsIgnoreCase(name)) {
                country.display();
                return;
            }
        }
        System.out.println("Country not found.");
    }

    // Display country information sorted by country name
    public void displaySortedByCountryName() {
        Collections.sort(countries, Comparator.comparing(EastAsiaCountries::getCountryName));
        displayCountryInformation();
    }
}
