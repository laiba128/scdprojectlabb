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
public class Laboratory {
    
    private String name;
    private String f_name;
    private String CNIC;
    private String Test;

    public Laboratory(){
        
    }
    public Laboratory(String name, String f_name, String CNIC, String Test) {
        this.name = name;
        this.f_name = f_name;
        this.CNIC = CNIC;
        this.Test = Test;
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

    public void setTest(String Test) {
        this.Test = Test;
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

    public String getTest() {
        return Test;
    }
       public void setData(String name, String f_name, String CNIC, String Test) {
        this.name = name;
        this.f_name = f_name;
        this.CNIC = CNIC;
        this.Test = Test;
     
       }
    
}
