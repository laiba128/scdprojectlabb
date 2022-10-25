/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;



/**
 *
 * @author HP
 */
public class LinkList {
     Node head;
    Node tail;
    
    public LinkList(){
        head=null;
        tail=null;
    }
        public  boolean isempty(){
        if(head==null&&tail==null)
            return true;
        else
            return false;
    }
        
   
 
    
    public  void push_back(int ID, String name, String Formula, int price, String medType, int m_date, int m_month, int m_year, int e_date, int e_month,int e_year){
       Node new_node=new Node(ID,name,Formula,price,medType,m_date,m_month,m_year,e_date,e_month,e_year);
          if(isempty())
          {
             head=new_node;
             tail=new_node;
          new_node.DisplayNode();
          }
          else{
              tail.next=new_node;
              tail=new_node;
              new_node.DisplayNode();
          }
          System.out.println("Record Added");
    }
    
    public boolean search(int id){
        Node temp=head;
        
        boolean check= true;
        while(temp!=null)
       {   if(temp.ID==id){
        System.out.println("Item is Found in the stock");  
        System.out.println("ID : "+temp.ID+"\nMdicine_Name : "+temp.name+"\nMedicine_Formula : "+temp.Formula+"\nMedicine_Type : "+temp.medType+"\nPrice"+temp.price+"\nManufacture Date : "+temp.m_date+"_"+temp.m_month+"_"+temp.m_year+"\nExpiryDate : "+temp.e_date+"_"+temp.e_month+"_"+temp.e_year);
                   return true;
       }
            temp=temp.next;
       }
         System.out.println("Item is not Found in the stock");
       return false;
        
    }
    public void del(int id){
       Node temp=head;
       Node pre=head;
       
       while(temp!=null){
           
           if(temp.ID==id)
           {
               if(head.next==null){
                 System.out.println("Item Deleted from record :");   
                   head=tail=null;
               }
               else if(head.ID==temp.ID){
                   System.out.println("Item Deleted from record :");
                   head=head.next;
               }
               else{ 
                   System.out.println("Item Deleted from record :");
                   pre.next=temp.next;
               }
           } 
           temp=temp.next;
       }  
}
}
