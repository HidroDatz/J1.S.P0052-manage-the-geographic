/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0052;

/**
 *
 * @author ASUS
 */
public class EastAsiaCountries extends Country {
    private String countryTerrain;

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    // Override the display method to include country terrain
    @Override
    public void display() {
        super.display();
        System.out.println("Country Terrain: " + countryTerrain);
    }
}
