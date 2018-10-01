/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch03.polymorphism.abstracts.ex1;

/**
 *
 * @author PC
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s%nsocial security number: $s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    
    public abstract double earnings();
}
