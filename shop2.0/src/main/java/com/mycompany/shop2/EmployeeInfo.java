package com.mycompany.shop2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel
 */
public class EmployeeInfo {

    private String name;
    private String phoneNo;
    private String address;

    public EmployeeInfo(String name, String phoneNo, String address) {
        this.address = address;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void SetAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String SetPhoneNo() {
        return this.phoneNo;
    }

    public String SetAddress() {
        return this.address;
    }

}
