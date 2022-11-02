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
public class Time {
    
    private int hour;
    private int min;
    private int sec;
    
    public Time(){
        hour=min=sec=0;
    }

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    
    public void setTime(int h,int m,int s){
        this.hour=h;
        this.min=m;
        this.sec=s;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
    
}
