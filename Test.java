/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Test {
    
    public static void main(String []args){
        
        Pharmacy p=new Pharmacy();
         int n;
        boolean check=true;
        
      do
        {
        System.out.println("................................................");
        System.out.println("------------Main Menu-----------------------");
        System.out.println("||****1.Add New Mecdicine        ****||");
        System.out.println("||****2.Check Total Stock        ****||");
        System.out.println("||****3.Update Medicine Stock    ****||");
        System.out.println("||****4.Search Medicine Stock    ****||");
        System.out.println("||****5.Delete Medicine Record   ****||");
        System.out.println("||****6.Print the Bill           ****||");
        System.out.println("||****7.Exit                     ****||");
        System.out.println("...............................................");
        
        System.out.println("Enter your choice : ");
        Scanner input=new Scanner(System.in);
         n=input.nextInt();
        
    
        switch(n){
            case 1:
                p.Add_record();
                break;
            case 2:
               p.Display_All();
                break;
             case 3:
                p.update();
                break; 
             case 4:
                 p.find();
                 break;
             case 5:
                 p.delete();
                 break;
             case 6:
                 p.print_Bill();
                 break;
             default:
                 System.out.print("---------------InValid Input-----------");
                 break;
        }
            String s;
           System.out.println("Do you want to continue press y if not press n");
           Scanner C=new Scanner(System.in);
           s=C.nextLine();
           
           if(s.equals("y")){
               check=true;
           }
           if(s.equals("n")){
               check=false;
           }
    }while(check=true);
        
}
}
