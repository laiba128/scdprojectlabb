/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Pharmacy {
    
    LinkList L=new LinkList();
    
    public void Add_record(){
        Scanner input=new Scanner(System.in);
       System.out.println("Enter the ID of Medicine : ");
       int ID=input.nextInt();
       System.out.println("Enter medicine name : ");
       String name=input.next();
       System.out.println("Enter Medicine Formula : ");
       String formula=input.next();
       System.out.println("Enter Medicine Price");
       int price=input.nextInt();
       System.out.println("Enter Medicine Type : ");
       String type=input.next();
       System.out.println("Enter Medicine Manufacture date");
       int date=input.nextInt();
       System.out.println("Enter Medicine Manufacture Month");
       int Mon=input.nextInt();
       System.out.println("Enter Medicine Manufacture Year");
       int Year=input.nextInt();
       System.out.println("Enter Medicine Expire date");
       int ex_date=input.nextInt();
       System.out.println("Enter Medicine Expire Month");
       int ex_mon=input.nextInt();
       System.out.println("Enter Mecdicine Expire Year");
       int ex_year=input.nextInt();
       
       L.push_back(ID, name, formula, price, type, date,Mon,Year, ex_date, ex_mon, ex_year);
    }
    
    public void update(){
        System.out.println("Enter ID to update the record");
        Scanner Sc=new Scanner(System.in);
        int Id=Sc.nextInt();
        L.search(Id);
        if(L.search(Id)==true){
            Scanner input=new Scanner(System.in);
       System.out.println("Enter the ID of Medicine : ");
       int ID=input.nextInt();
       System.out.println("Enter medicine name : ");
       String name=input.next();
       System.out.println("Enter Medicine Formula : ");
       String formula=input.next();
       System.out.println("Enter Medicine Price");
       int price=input.nextInt();
       System.out.println("Enter Medicine Type : ");
       String type=input.next();
       System.out.println("Enter Medicine Manufacture date");
       int date=input.nextInt();
       System.out.println("Enter Medicine Manufacture Month");
       int Mon=input.nextInt();
       System.out.println("Enter Medicine Manufacture Year");
       int Year=input.nextInt();
       System.out.println("Enter Medicine Expire date");
       int ex_date=input.nextInt();
       System.out.println("Enter Medicine Expire Month");
       int ex_mon=input.nextInt();
       System.out.println("Enter Mecdicine Expire Year");
       int ex_year=input.nextInt();  
        }
        else{
            System.out.println("Item Not Found");
        }
    }
    public void find(){
        System.out.println("Enter record for ID");
        Scanner S=new Scanner(System.in);
        int ID=S.nextInt();
        L.search(ID);
    }
    
    public void delete(){
         System.out.println("Enter record for ID");
        Scanner S=new Scanner(System.in);
        int ID=S.nextInt();
        L.del(ID);
    }
    public void print_Bill(){
             Node temp=L.head;
     int total=0;
     boolean find=true;
     
     while(temp!=null){
         total=total+temp.price;
         temp=temp.next;
     }
     if(find){
       System.out.println(total); 
        return;
     }
      System.out.println("Not Available");
 } 
    
    public void Display_All(){
           Node temp;
        temp=L.head;
       while (temp!=null){
        temp.DisplayNode();
        temp=temp.next;
    }
    }
}
