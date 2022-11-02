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
public class Patient {
    
   private String name;
   private String f_name;
   private String CNIC;
   private String illness;
   private String Doctor;
   private Date dob;
   private Time t;
    
    public Patient(){
        this.name=null;
        this.f_name=null;
        this.CNIC=null;
        this.Doctor=null;
        this.illness=null;
        this.dob=new Date();
        this.t= new Time();
    }

    public Patient(String name, String f_name, String CNIC, String illness, String Doctor, Date dob, Time t) {
        this.name = name;
        this.f_name = f_name;
        this.CNIC = CNIC;
        this.illness = illness;
        this.Doctor = Doctor;
        this.dob = dob;
        this.t = t;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setT(Time t) {
        this.t = t;
    }
   
    public void setDob(int d,int m,int y){
        this.dob.setDay(d);
        this.dob.setMon(m);
        this.dob.setYear(y);
    }
    
      public String getDOB() {
        return dob.getDay()+"-"+dob.getMon()+"-"+dob.getYear();
      }
      public void setTime(int h,int m,int s){
          this.t.setHour(h);
          this.t.setMin(m);
          this.t.setSec(s);
      }
      public String getT(){
         return t.getHour()+":"+t.getMin()+":"+t.getSec();
      }
      
    public String getName() {
        return name;
    }

    public String getF_name() {
        return f_name;
    }

    public String getCNIC() {
        return CNIC;
    }

    public String getIllness() {
        return illness;
    }

    public String getDoctor() {
        return Doctor;
    }

    public Date getDob() {
        return dob;
    }

    public Time getTObject() {
        return t;
    }
    
      public void setData(String name, String f_name, String CNIC, String illness, String Doctor, String dob, String t) {
        this.name = name;
        this.f_name = f_name;
        this.CNIC = CNIC;
        this.illness = illness;
        this.Doctor = Doctor;
        dob = dob;
        t = t;
      }

    void setData(String next, String next0, String next1, String next2, String next3, String next4, String next5, String next6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    public static boolean login(String uname, String pass){
        if(uname.equals("test") && pass.equals("123"))
            return true;
        else 
            return false; 
    }
}
