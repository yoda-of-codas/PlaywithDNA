/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dna;

import java.util.Scanner;

/**
 *
 * @author BAKEL J
 */
public class DNA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      intro();
    }
      public static void intro(){
         System.out.println("\t _________________________________");
     System.out.println("\t|| HI I AM A DNA REPLICA CREATOR ||");
      System.out.println("\t```````````````````````````````````");
      code();
    }
    
      public static void code(){
                 System.out.println("ENTER ANY STRING >>> NOTE STRING OF CHARACTERS BETWEEN 1 AND 3 WOULD GIVE BETTER RESULTS: " +
"");
       Scanner input = new Scanner (System.in);
        String w = input.nextLine();
       System.out.println("ENTER THE NUMBER OF UNITS OF DNA YOU WANT>> ");
        
        int k = input.nextInt();
        
        for (int i = 0 ; i<k; i++){
            System.out.println("      "+ w);
            System.out.println(  "   "+w+"----"+w);
            System.out.println( "  "+w+"------"+w);
            System.out.println(" "+w+"--------"+w);
            System.out.println("  "+w+"------"+w);
            System.out.println("   "+w+"----"+w);
            System.out.println( "     "+   w   );// To produce a single unit of the dna
            
        }
        again();
      }
       public static void again(){
          System.out.print("Enter yes to try again otherwise enter no : ");

       Scanner end = new Scanner (System.in);
        String ending = end.nextLine();
       String y = ending.toLowerCase();
  if (y.startsWith("y" )){
      code(); 
   } else{
           System.out.println("Thank you for using me......");
           }
  Scanner any = new Scanner (System.in);
  String line = any.nextLine();
    }
}
