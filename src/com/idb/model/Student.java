package com.idb.model;

public class Student {

    private String lastName, firstName, gend, address, email, classNo, regNo, dateOfBirth;
    private int age, phone;

    public String getLastName() {
        return lastName;
    }

    public void Student(String lastName, String firstName, String gend, String address, String email, String classNo, String regNo, String dateOfBirth, int age, int phone) {
        this.classNo = classNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gend = gend;
        this.address = address;
        this.email = email;
        this.regNo = regNo;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.phone = phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGend() {
        return gend;
    }

    public void setGend(String gend) {
        this.gend = gend;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
