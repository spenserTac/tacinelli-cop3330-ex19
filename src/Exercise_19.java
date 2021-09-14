/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_19{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Height: ");
        String temp_height = scanner.nextLine();
        float height = Float.parseFloat(temp_height);

        System.out.print("Weight: ");
        String temp_weight = scanner.nextLine();
        float weight = Float.parseFloat(temp_weight);

        float bmi = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + String.format("%.1f", bmi) + ".");
        if(bmi <= 25 && bmi >= 18.5){
            System.out.println("You are within the ideal weight range.");
        }
        else if(bmi < 18.5){
            System.out.println("You are underweight. You should see a doctor.");
        }
        else{
            System.out.println("You are overweight. You should see a doctor.");
        }
    }
}