
/*--------------------------------------------
    Program 1: Garrett's Popcorn Calorie Tracker
    The objective of this program is to determine the number of calories per a user will consume
    based on the number of cups of popcorn the user enters.  The nutritional facts state that there 
    are 150 calories (54 calories from fat) per 1 cup (30 grams) of Garrett's mixed popcorn.  You will 
    create a program that lets the user enter the number of cups of popcorn they ate and then report 
    the total number of calories consumed, total number of calories from fat, and the amount of popcorn 
    in grams consumed. 

    Calorie Information: https://www.nutritionix.com/i/garrett-popcorn-shops/garrett-mix/581d840270aa658137d9ddd6

	
	There will be five requirements for Program 1
	Requirement 1 - Variables declared and intialized; Constant variables declared; Properly utilized Scanner Object
                    
	Requirement 2 - Input/Output of all necessary information 
                    
    Requirement 3 - Correct calculations are made for cup to calorie conversion, calories from fat and cup to grams
    Requirement 4 - Style - Proper use of comments, spacing, in program; use of
                    descriptive variable names
    Requirement 5 - Program is submitted by the due date listed and pushed to assigned GitHub Repository; 
                    Repository contains a minimum of three commits.
	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Fall 1 2022
    System: Visual Studio Code, Windows 10
    Author: C. Fulton
*/
import java.util.Scanner; //Scanner Class imported

public class Calories {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        
        try (//DECLARATIONS (Declare your variables below including your Scanner Object)
        Scanner scnr = new Scanner(System.in)) {
            int cupsConsumed;
            final int grams_per_cup = 30;
            final int calories_per_cup = 150; 
            final int calories_from_fat = 54;
            int totalCalories;
            int totalCaloriesfromfat;
            int totalGrams;
            String wordName;

            //INTRODUCTION
            System.out.println("Welcome to the Garrett's Popcorn Calorie Tracker!  This program will allow you to enter the total number of cups of Garrett's popcorn and provide you with the total number of calories consumed, the breakdown of calories from fat and the total number of grams per cup consumed.");
            System.out.println ();
            

            //INPUT AND OUTPUT (Use wording found in .gif video on README.md )
            System.out.println("To get started, please enter the total number of cups of popcorn consumed:");
            cupsConsumed = scnr.nextInt();
            System.out.println("Please enter your name:");
            wordName = scnr.next();
            System.out.println ();
            System.out.println (wordName + " your caloric intake of Garrett's popcorn is listed below");
            System.out.println ("********************************************************************");


        //MAKE CALCULATIONS
            totalCalories = cupsConsumed * calories_per_cup; 
            totalCaloriesfromfat = cupsConsumed * calories_from_fat;
            totalGrams = cupsConsumed * grams_per_cup;


        //OUTPUT DATA TO CONSOLE
            System.out.println();
            System.out.println(cupsConsumed + " cup(s) equates to " + totalCalories + " calories");
            System.out.println(cupsConsumed + " cup(s) equates to " + totalGrams + " consumed");
            System.out.println("Out of " + totalCalories + " total calories - " + totalCaloriesfromfat + " is calories from fat");



    }
}}

