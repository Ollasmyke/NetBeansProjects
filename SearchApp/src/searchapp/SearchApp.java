package searchapp;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ollas
 */
public class SearchApp {
    
    public static void main(String[] args) {
       
       Scanner scnr = new Scanner(System.in);
       System.out.println("Enter Elements:");  //To input Array
       String element = scnr.next();
       String[] inputNumber = element.split(",");
       
       int[] arr =new int[inputNumber.length]; 
       
       for(int i = 0; i < inputNumber.length; i++){  
           arr[i]= Integer.parseInt(inputNumber[i]);
            //arr[i]=scnr.nextInt();
       }
       
       System.out.println("Enter the Element to search for:");  //Element x to search for
       int x = scnr.nextInt();
       
       Arrays.sort(arr); //Sort Array method sorts in Ascending flow
       System.out.println("The sorted List is as follows:");
       for (int i : arr) {
       System.out.println(i);
        }
        int keyIndex = Arrays.binarySearch(arr,x);
        int keyIndexed = keyIndex + 1;
        if (keyIndex < 0){
        System.out.print("The search Index value do not exist!");
        }
        else{
        System.out.print("The search Index value for " + x + " is: " + keyIndexed + "\n");
                }
        
        }
        
        
       }