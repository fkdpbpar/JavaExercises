/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi09.pkg03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 30694
 */
public class Askisi0903 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        String name = input.next();
        char gender = 'N';
        insertGender(gender);
        System.out.println("What's your age?");
        int age = input.nextInt();
        int xronosGennisis = (2019 - age);
        while (age>40 || age<0){
            System.out.println("Insert 0<age<40");
            age=input.nextInt();
        }
        if (age >= 0 && age <= 5) {
            System.out.println("You are too young for this app.");
            System.out.println("Come back in " + (6 - age) + " years when you will be a student.");
        } else if (age >= 6 && age <= 18) {
            System.out.println("Oh you are a student");
            System.out.println("Keep up... " + (20 - age) + " more years left and afterwards you will make money.");
        } else if (age >= 19 && age <= 40) {
            System.out.println("Well, you must be employed.");
            System.out.println("You finished school " + (age - 18) + " years ago.");
        }
        xronosGennisisReturn(xronosGennisis, age);
        System.out.println("In 2040 you will be " + (age + 21) + " years ago.");
        System.out.println("What's your favorite season? (Answer: 1 for Winter or 2 for Spring or 3 for Summer or 4 for Autumn");
        int season = input.nextInt();
        if (season == 1) {
            System.out.println("It must be cold outside");
        } else if (season == 2) {
            System.out.println("Ohh, flowers are very beautiful these days");
        } else if (season == 3) {
            System.out.println("Let's go for swimming");
        } else if (season == 4) {
            System.out.println("The trees are full of brown leaves");
        }
        System.out.println("Give your height in meters");
        double height = input.nextDouble();
        System.out.println("Give your weight in Kg");
        double weight = input.nextDouble();
        double bmi = (weight / (height * height));
        if (bmi <= 18.5) {
            System.out.println("You are Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You are Normal weight");
        } else if (bmi >= 24.9 && bmi <= 29.9) {
            System.out.println("You are Overweight");
        } else if (bmi >= 30) {
            System.out.println("You are Obesity");
        }
        int sum1=0;
        int sum=findSum(sum1);

        if (sum > 6) {
            sum = sum % 7;
        }
        String luckyDay = "";
        if (sum == 0) {
            System.out.println("Your lucky day is Monday");

        } else if (sum == 1) {
            System.out.println("Your lucky day is Tuesday");

        } else if (sum == 2) {
            System.out.println("Your lucky day is Wednesday");
            luckyDay = "Wednesday";
        } else if (sum == 3) {
            System.out.println("Your lucky day is Thuerday");
        } else if (sum == 4) {
            System.out.println("Your lucky day is Friday");
        } else if (sum == 5) {
            System.out.println("Your lucky day is Saturday");
        } else if (sum == 6) {
            System.out.println("Your lucky day is Sunday");
        }
        
        if ((luckyDay.equals("Wednesday") == true) && (age >= 20) && (age <= 40)) {
            if (age >= 20 && age <= 25 && gender == 'M') {
                System.out.println("Hello " + name + " you can enter in the club");
            } else if ((age > 25) && (gender == 'M')) {
                System.out.println("Hello Mr " + name + " you can enter in the club");
            } else if (gender == 'F') {
                System.out.println("Are you married?(Yes or No)");
                String answer=input.next();
                if (answer.equals("Yes") == true) {
                    System.out.println("Hello Mrs " + name + " you can enter in the club");
                } else {
                    System.out.println("Hello Ms " + name + " you can enter in the club");
                }
            }
        }
    }

    static void xronosGennisisReturn(int xronosGennisis, int age) {

        if (xronosGennisis >= 1980) {
            System.out.println("In 1980 you were not born...");
        } else if (xronosGennisis <= 1980) {
            System.out.println("In 1980 you were " + (age - 39) + " years old");
        }
    }
    static void insertGender(char gender){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your gender M or F?");
        gender = input.next().charAt(0);
    }
    static int findSum(int age){
        int ageInAge = 365 * age;
        int sum1 = 0;
        while (ageInAge > 0) {
            sum1 = sum1 + ageInAge % 10;
            ageInAge = ageInAge / 10;
        }
        return sum1;
    }
}
