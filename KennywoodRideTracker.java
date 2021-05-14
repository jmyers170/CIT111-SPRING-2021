/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls3_classStructure;

import java.util.Random;

/**
 *
 * @author jmyer
 */
public class KennywoodRideTracker {
    
    private static int totalRiders = 0;
    private static int totalFailedRideAttempts = 0;
    private static int totalSickRiders = 0;
    
    final static int MIN_HEIGHT_THRILL_RIDES = 50;
    final static int MIN_HEIGHT_THEME_RIDES = 34;
    
        public static void main(String [] args){
            System.out.println("In Main");
            rideBlackWidow(10 , 60);
            printRiderStats();
            rideBlackWidow(4 , 60);
            printRiderStats();
            rideBlackWidow(342 , 60);
            printRiderStats();
            rideMerryGoRound(36 , 12);
            printRiderStats();
            rideMerryGoRound(178 , 77);
            printRiderStats();
            rideMerryGoRound(12 , 28);
            printRiderStats();
      
    } // closes main
        
        public static void rideBlackWidow(int riders, int avgHeight){
            if(avgHeight >= MIN_HEIGHT_THRILL_RIDES){
            
                System.out.println("Riding Black Widow");
                System.out.println("I HATE SPIDERS!!!!!");
              // adding incoming riders to member variable tracking totalRiders
                totalRiders = totalRiders + riders;
                Random rand = new Random();
                int numSickRiders = rand.nextInt(riders);
                totalSickRiders =  totalSickRiders + numSickRiders;
            } else{
                System.out.println(riders + "riders turned away sad "
                        + "too short.");
                totalFailedRideAttempts = totalFailedRideAttempts + riders; 
                        } // end if/else statement
        } // closes method
        
        public static void rideMerryGoRound(int riders, int avgHeight){
              if(avgHeight >= MIN_HEIGHT_THEME_RIDES){
            
            System.out.println("Riding Merry-Go-Round");
            System.out.println("Round...and round...and round\n");
            totalRiders = totalRiders + riders;
            Random rand = new Random();
            int numSickRiders = rand.nextInt(riders);
            totalSickRiders = totalSickRiders + numSickRiders;
            
        } else {
           System.out.println(riders + " riders turned away crying:too short");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        } // end if/else
        
            
        } // closes method
        
        public static void printRiderStats(){
          System.out.println("total riders " + totalRiders);
          System.out.println("*******RIDER STATS*********");
          System.out.println("Total Riders: " + totalRiders);
          System.out.println("Total Failed Ride Attempts: "
                  + totalFailedRideAttempts);
          System.out.println("Total sick riders: " + totalSickRiders);
          System.out.println("***************************\n");
        }// closes method
        
        
        
        
        
        
        
        
        
} // closes class

