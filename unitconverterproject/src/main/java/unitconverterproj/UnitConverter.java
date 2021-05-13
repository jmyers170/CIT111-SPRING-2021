/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitconverterproj;

import java.util.Scanner;


/**
 *
 * @author jmyer
 */
public class UnitConverter {
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of kilograms to be converted.");
        
        double userWeight = scan.nextDouble();
        double returnedWeight = convertKilogramToPounds(userWeight);
        
        System.out.println("The number of pounds is " + returnedWeight);
        
        System.out.println("Please enter the number of miles");
        
        double userDistance = scan.nextDouble();
        double returnedDistance = convertMilesToKilometer(userDistance);
        
        System.out.println("The number of kilometers is " + returnedDistance);
        
        System.out.println("Please enter the number of gallons.");
        
        double userLiquid = scan.nextDouble();
        double returnedLiquid = convertGallonToLitre(userLiquid);
        
        System.out.println("The number of litres is " + returnedLiquid);
        
    }
    
    public static double convertKilogramToPounds(double pounds){ 
        final double POUNDS_PER_KILOGRAM = 2.2;
        double weight = pounds * POUNDS_PER_KILOGRAM;
        return weight;
                
                
     }
    
    public static double convertMilesToKilometer(double miles){
        final double MILES_PER_KILOMETER = 1.60934;
        double distance = miles *   MILES_PER_KILOMETER;
        return distance;
        
    }
      
    public static double convertGallonToLitre(double gallon) {
        final double GALLON_TO_LITRE = 3.78541;
        double liquid = gallon * GALLON_TO_LITRE;
        return liquid;
        
    }
        
    
}
