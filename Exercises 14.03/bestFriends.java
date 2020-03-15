//9. Create a program that stores the names of your 4 best friends in an array. Then print these names from the array. Use for-traditional, for enhanced, while, do-while.
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 30694
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList();
        Scanner input=new Scanner(System.in);
 for (int i=0;i<=3;i++){
String name=input.next();
 list.add(name);
 
 }
for(int j=0;j<=3;j++){
System.out.println(list.get(j));
 }
    }
    
}
