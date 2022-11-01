/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagementSystem;

/**
 *
 * @author HP
 */
public class Doctor {
    
    private String D_name;
    private String App_time;
    private String App_fee;
    private int payment;
    
    public Doctor(){
        
    }

    public Doctor(String D_name, String App_time, String App_fee, int payment) {
        this.D_name = D_name;
        this.App_time = App_time;
        this.App_fee = App_fee;
        this.payment = payment;
    }

    public void setD_name(String D_name) {
        this.D_name = D_name;
    }

    public void setApp_time(String App_time) {
        this.App_time = App_time;
    }

    public void setApp_fee(String App_fee) {
        this.App_fee = App_fee;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    
    public String getD_name() {
        return D_name;
    }

    public String getApp_time() {
        return App_time;
    }

    public String getApp_fee() {
        return App_fee;
    }

    public int getPayment() {
        return payment;
    }
    
    public void setData(String D_name, String App_time, String App_fee, int payment) {
        this.D_name = D_name;
        this.App_time = App_time;
        this.App_fee = App_fee;
        this.payment = payment;
    }
    
}
