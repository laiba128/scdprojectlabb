/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Node {
     int ID;
 String name;
 String Formula;
 int price;
 String medType;
 int m_date;
 int m_month;
 int m_year;
 int e_date;
 int e_month;
 int e_year;
 Node next;

    public Node(int ID, String name, String Formula, int price, String medType, int m_date, int m_month, int m_year, int e_date, int e_month, int e_year) {
        this.ID = ID;
        this.name = name;
        this.Formula = Formula;
        this.price = price;
        this.medType = medType;
        this.m_date = m_date;
        this.m_month = m_month;
        this.m_year = m_year;
        this.e_date = e_date;
        this.e_month = e_month;
        this.e_year = e_year;
        this.next = next;
    }



 

 public void DisplayNode(){
            System.out.println("ID : "+ID+"\nMdicine_Name : "+name+"\nMedicine_Formula : "+Formula+"\nMedicine_Type : "+medType+"\nPrice"+price+"\nManufacture Date : "+m_date+"_"+m_month+"_"+m_year+"\nExpiryDate : "+e_date+"_"+e_month+"_"+e_year);

 } 
}
