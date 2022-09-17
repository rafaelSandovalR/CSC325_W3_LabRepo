/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.farmingdale.csc325_f22_w3_lab;

/**
 *
 * @author Rsand
 */
public class Student implements Person{
    
    String fName;
    String lName;
    String address;
    double gpa;
    
    public String getfName(){
      return fName;  
    };
    
    public void setfName(String fName){
        this.fName = fName;
    }

    @Override
    public void setAddress(String s) {
        
    }

    @Override
    public String getAddress() {
        return address;
    }
    
}
