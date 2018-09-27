/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch02.objects.inheritance.ex1;

/**
 *
 * @author PC
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossRate, double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, grossRate, commissionRate);
        
        if(baseSalary < 0.0)
        {
            throw new IllegalArgumentException("");
        }
        this.baseSalary = baseSalary;
    }
    
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    public void setBaseSalary(double baseSalary)
    {
        if(baseSalary < 0.0)
        {
            throw new IllegalArgumentException("");
        }
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double earnings()
    {
        return getBaseSalary() + super.earnings();
    }
    
    // retornamos una representacion String del objeto CommisionEmployee
    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "CommissionEmployee", super.getFirstName(), super.getLastName(), "Social Security number", super.getSocialSecurityName(), 
                "gross sales", super.getGrossSales(), "commission rate", super.getCommisionRate(), "Base salary", baseSalary);
    }
}
