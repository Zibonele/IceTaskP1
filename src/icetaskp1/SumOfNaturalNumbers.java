/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetaskp1;
//import a scanner
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class SumOfNaturalNumbers {
   public static void main(String[]args){
       //use scanner to prompt user 
   Scanner Rowney = new Scanner(System.in);
   //use scanner to prompt user to enter an integer
   System.out.println(" Enter Number "); 
   int n = Rowney.nextInt();
   int sum = 0;
   //use a for loop
   for(int i = 1; i <=n; i++){
       sum+= i;
   }
   //print output to display the sum of natural numbers
   System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
   }
   
   } 

