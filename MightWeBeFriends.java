/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author jmyer
 */
public class MightWeBeFriends {
    public static void main (String [] args){
        System.out.println ("Might we be friends?");
        // Container for user imput. No initial value given.
        int answerGames;
        int answerCars;
        int answerComputer;
        // Compatability score. This variable will change based on user imput.
        int compScore = 0;
        
        System.out.println("Q 1/3: Do you enjoy playing video games? "
                + " Yes = 1 No = 0");
        
        Scanner keyboardReader = new Scanner(System.in);
        answerGames = keyboardReader.nextInt();
        
        if (answerGames == 1){
            compScore = compScore + 10;
            System.out.println("Awesome");
            System.out.println("Your score so far is " + compScore);
        } else {
            System.out.println("You would like them if you tried.");
        }
        System.out.println("Q 2/3: Do you like classic cars"
                + " Yes = 1 No = 0");
        
        answerCars = keyboardReader.nextInt();
        
        if (answerCars == 1){
            compScore = compScore + 10;
            System.out.println("That is a good sign");
            System.out.println("Your score now is " + compScore);
         } else{
            System.out.println("Thats not gonna help");
        }
        
        System.out.println("Q 3/3: Do you like computer programming?"
                + " Yes = 1 No = 0");
        answerComputer = keyboardReader.nextInt();
        
        if (answerComputer == 1){
            compScore = compScore + 10;
            System.out.println("That great");
            System.out.println("Your score now is " + compScore);
         } else{
            System.out.println("You should give it a try.");
        }
        
        System.out.println("**************************");
        System.out.println("AND THE RESULTS ARE IN");
        System.out.println("**************************");
        
        if (compScore > 15) {
            System.out.println("YAY! We can be friends");
            
        } else {
            System.out.println(" Im sorry, but according to this program"
                    + " We are not compatible");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }  
}
