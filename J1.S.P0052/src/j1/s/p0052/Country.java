/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0052;

/**
 *
 * @author ASUS
 */
public class Country {
    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country() {
        // Default constructor
    }

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    // Setters and getters
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public float getTotalArea() {
        return totalArea;
    }

    // Display country information
    public void display() {
        System.out.println("Country Code: " + countryCode);
        System.out.println("Country Name: " + countryName);
        System.out.println("Total Area: " + totalArea);
    }
}
