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
public class SalariedEmployee extends Employee {
    
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weekleySalary)
    {
        super(firstName, lastName, socialSecurityNumber);
        if(weekleySalary < 0.0)
        {
            throw new IllegalArgumentException("weekly salary must be >= 0.0");
        }
        this.weeklySalary = weekleySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    
    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}
