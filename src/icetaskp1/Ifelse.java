/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetaskp1;
//import Scanner 
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use Scanner to prompt user to enter integer
         Scanner rowney = new Scanner(System.in);
         int year;
         
         //prompt user to enter a year
        System.out.println(" Enter a year: ");
      
        year = rowney.nextInt();
        rowney.close();
        
        if(year % 4 == 0 && year % 100!=0){
            System.out.println(year + ": Is A Leap Year ");
        }else if (year % 400 ==0){
            System.out.println(year + ": Year Is A Leap Year ");
        }else{
            System.out.println(year + " Is Not A Leap Year");
        }   
        
        
    }
    
    }
    

