/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;

/**
 *
 * @author ollas
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int age = scnr.nextInt();
        
        /*int age;
        age = 12; */
        age = age + 2015;
        System.out.print(age);
        
    }
    
}
