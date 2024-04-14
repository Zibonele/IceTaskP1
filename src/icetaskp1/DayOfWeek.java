/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetaskp1;
//import scanner
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class DayOfWeek {
    public static void main (String []args){
        //import scanner to prompt user to enter an integer
    Scanner Rowney = new Scanner(System.in);
    //prompt user to enter an integer
       System.out.println("Enter number: ");
    int num;
       num = Rowney.nextInt();
       Rowney.close();
     switch(num)
     {
     case 1:
        System.out.println(" Sunday ");
        break;
     case 2:
        System.out.println(" Monday ");
        break;
     case 3:
        System.out.println(" Tuesday ");
        break;
     case 4:
        System.out.println(" Wednesday ");
        break;
     case 5:
        System.out.println(" Thursday ");
        break;
     case 6:
        System.out.println(" Friday ");
        break;
     case 7:
        System.out.println(" Saturday ");
        break;
     default:
         System.out.println(" INVALID DAY!!!! PLEASE ENTER A VALID DAY "); 
             
     } 
    
    }
}
