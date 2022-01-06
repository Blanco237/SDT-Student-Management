/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projectfiles.main;

/**
 *
 * @author Admin
 */
public class Student {
    private int Stud_ID;
    private String name;
    private String surname;
    private String dob;
    private String pob;
    private String pName;
    private String pAddress;
    private String division;
    private String region;
    private String mStatus;
    private String sex;

    public int getStud_ID() {
        return Stud_ID;
    }

    public void setStud_ID(int Stud_ID) {
        this.Stud_ID = Stud_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public void displayStudent(){
        System.out.println("\nStudent ID: "+this.Stud_ID);
        System.out.println("Name: "+this.name);
        System.out.println("Surname: "+this.surname);
        System.out.println("Date-Of-Birth: "+this.dob);
        System.out.println("Place-Of-Birth: "+this.pob);
        System.out.println("Parents Name: "+this.pName);
        System.out.println("Parents Address: "+this.pAddress);
        System.out.println("Division:  "+this.division);
        System.out.println("Region: "+this.region);
        System.out.println("Marital Status: "+this.mStatus);
        System.out.println("Sex: "+this.sex);
    }
    
}
