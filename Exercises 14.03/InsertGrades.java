/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertGrades;

import java.util.Scanner;

/**
 *
 * @author 30694
 */
public class InsertGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert grade (e.g. A, B etc)");
        char bathmos = input.next().charAt(0);
        switch (bathmos) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B'://only constants (final) variables
                System.out.println("Well Done");
                break;
            case 'C':
                System.out.println("Very Good");
                break;
            case 'D':
                System.out.println("Good");
                break;
            case 'E':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

}
