/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.math.BigInteger;
import java.util.Scanner;


/**
 *
 * @author ollas
 */
public class Factorial {
    public static void main(String[]args){
    
        Scanner scnr = new Scanner(System.in);
        System.out.print("Input factorial Value:");
        BigInteger numb = scnr.nextBigInteger();
        
        BigInteger i ;
        BigInteger fact = BigInteger.ONE;
        
        
        for (i=BigInteger.ONE; i.compareTo(numb) == -1 || i.compareTo(numb) == 0; i = i.add(BigInteger.ONE) ){
            fact = fact.multiply(i);
        }   
        System.out.print("The factorial is:" + fact + ".\n");
        
        // displaying the process of achieving the final result
        // If(){};
        System.out.print("----------------------------------------------\n");
        System.out.print("The Method for calculating the Factorial\n");
        System.out.print("----------------------------------------------\n");
        System.out.print("The number to be factorized is  " + numb + ".\n");
        
        BigInteger n;
        BigInteger m = BigInteger.ONE;
           
        for (n=BigInteger.ONE; n.compareTo(numb) == -1 || n.compareTo(numb) == 0; n = n.add(BigInteger.ONE) ){
            
            System.out.print(m + "*" + n + "= ");
          m =  m.multiply(n);
            System.out.print(" " + m);
            System.out.print("  Then; \n");
        }   
        
        } 
       
    }