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
        ArrayList<String> list = new ArrayList();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.println("Give "+(i+1)+" name");
            String name = input.next();
            list.add(name);

        }
        for (int j = 0; j <= 3; j++) {
            System.out.println(list.get(j));
        }
        for (String name : list) {
            System.out.println(name);
        }
        int a=0;
        while(a<4){
            System.out.println(list.get(a));
            a+=1;
            
        }
    }

}
